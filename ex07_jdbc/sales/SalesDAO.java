package ex07_jdbc.sales;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import ex07_jdbc.DBConn;

public class SalesDAO {
	//일일 상품 판매 리스트
	List<Map<String, Object>> dayItemSalesList(){
		List<Map<String, Object>> list =  new ArrayList<>();
		
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		ResultSet rs = null;
		
		
		StringBuffer sbr = new StringBuffer();
		sbr.append("SELECT S.SALEDATE, S.SEQ, S.ITEMCODE, I.ITEMNAME, S.QTY, S.AMOUNT ");
		sbr.append("FROM SALES S INNER JOIN ITEM I ON (S.ITEMCODE = I.ITEMCODE) ");
		sbr.append("ORDER BY S.SALEDATE, S.SEQ");
		
		try {
			pt = cn.prepareStatement(sbr.toString());
			rs = pt.executeQuery();
			while (rs.next()) {
				String saledate = rs.getString("saledate");
				int seq = rs.getInt("seq");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
				
				//System.out.println("----------------------");
				//System.out.println("등록일자 : " + saledate);
			    //System.out.println("상품코드 : " + itemcode);
				//System.out.println("상품이름 : " + itemname);
				//System.out.println("판매수량 : " + qty);
			   // System.out.println("판매금액 : " + amount);
			    
			    //한건 데이터 저장
			    Map<String, Object> mp = new HashMap<>(); 
			    
			    mp.put("saledate", saledate);
			    mp.put("seq", seq);
			    mp.put("itemcode", itemcode);
			    mp.put("itemname", itemname);
			    mp.put("qty", qty);
			    mp.put("amount", amount);
			    
			    list.add(mp);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return list;
	}
	
		//일일 상품별 집계 판매
		List<Map<String, Object>> dayItemTotalSales(){
			List<Map<String, Object>> list =  new ArrayList<>();
			Connection cn = DBConn.getConn();
			PreparedStatement pt = null;
			ResultSet rs = null;
			StringBuffer sbr = new StringBuffer();
			
			
			sbr.append("SELECT S.SALEDATE, S.ITEMCODE, ");
			sbr.append("MAX(I.ITEMNAME) ITEMNAME, ");
			sbr.append("SUM(S.QTY) QTY,  SUM(S.AMOUNT) AMOUNT ");
			sbr.append("FROM SALES S ");
			sbr.append("INNER JOIN ITEM I ");
			sbr.append("ON S.ITEMCODE = I.ITEMCODE ");
			sbr.append("GROUP BY S.SALEDATE, S.ITEMCODE ");
			sbr.append("HAVING SUM(S.QTY) > 3 ");
			sbr.append("ORDER BY S.SALEDATE, AMOUNT DESC ");
		
		try {
			pt = cn.prepareStatement(sbr.toString());
			rs = pt.executeQuery();
			while(rs.next()) {
				String saledate = rs.getString("saledate");
				String itemcode = rs.getString("itemcode");
				String itemname = rs.getString("itemname");
				int qty = rs.getInt("qty");
				int amount = rs.getInt("amount");
		
				//System.out.println("----------------------");
				//System.out.println("등록일자 : " + saledate);
				//System.out.println("상품코드 : " + itemcode);
				//System.out.println("상품이름 : " + itemname);
				//System.out.println("판매수량 : " + qty);
				//System.out.println("판매금액 : " + amount);
		 
		
				Map<String, Object> mp = new HashMap<>(); 
				
				//map       키        값
				mp.put("saledate", saledate);
				mp.put("itemcode", itemcode);
				mp.put("itemname", itemname);
				mp.put("qty", qty);
				mp.put("amount", amount);
				
				//리스트에 맵을 담는다.
							list.add(mp);
						}
					} catch (SQLException e) {
						e.printStackTrace();
					}
					return list;
				}
		
		//상품별 판매 금액
		List<Map<String, Object>> Salesamount(String saledate) {
			List<Map<String, Object>> list = new ArrayList<>();
			Connection cn = DBConn.getConn();
			PreparedStatement pt = null;
			ResultSet rs = null;
			
			
			StringBuffer sbr = new StringBuffer();
			sbr.append("SELECT I.ITEMCODE, I.ITEMNAME, I.PRICE, NVL(S.AMOUNT,0) AMOUNT, NVL(I.BIGO,' ') BIGO, I.REGDATE ");
			sbr.append("FROM ITEM I LEFT JOIN ");
			sbr.append("            (SELECT ITEMCODE, SUM(AMOUNT) AMOUNT "); 
			sbr.append("               FROM SALES ");
			sbr.append("				WHERE SALEDATE = ? "); 
			sbr.append("            	GROUP BY ITEMCODE) S ");
			sbr.append("ON I.ITEMCODE = S.ITEMCODE ");
			sbr.append("ORDER BY I.ITEMCODE ");
			
			
			try {
				pt = cn.prepareStatement(sbr.toString());
				pt.setString(1, saledate);
				rs = pt.executeQuery();
				while(rs.next()) {
					Map<String, Object> mp = new HashMap<>();
					
					mp.put("itemcode", rs.getNString("itemcode"));
					mp.put("itemname", rs.getNString("itemname"));
					mp.put("price", rs.getNString("price"));
					mp.put("amount", rs.getNString("amount"));
					mp.put("bigo", rs.getNString("bigo"));
					mp.put("regdate", rs.getNString("regdate"));
					
					list.add(mp);
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;
		}
		
		
		//VIEW를 이용해서 상품별 판매 조회
		List<Map<String, Object>> SalesView(String saledate) {
			List<Map<String, Object>> list = new ArrayList<>();
			
			Connection cn = DBConn.getConn();
			PreparedStatement pt = null;
			ResultSet rs = null;
			StringBuffer sbr = new StringBuffer();
			sbr.append("SELECT * FROM DAY_ITEM_SALES_VIEW " + 
					"WHERE SALEDATE = ?");
			
			try {
				pt = cn.prepareStatement(sbr.toString());
				pt.setString(1, "saledate");
				rs = pt.executeQuery();
				while(rs.next()) {
					Map<String, Object> mp = new HashMap<>();
					mp.put("itemcode", rs.getNString("itemcode"));
					mp.put("itemname", rs.getNString("itemname"));
					mp.put("price", rs.getNString("price"));
					mp.put("amount", rs.getNString("amount"));
					mp.put("bigo", rs.getNString("bigo"));
					mp.put("regdate", rs.getNString("regdate"));
					
					list.add(mp);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return list;

		}
}
