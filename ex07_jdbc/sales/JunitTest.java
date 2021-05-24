package ex07_jdbc.sales;


import java.util.List;
import java.util.Map;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class JunitTest {

	@Test
	void dayItemSalesListtest() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list  = sdao.dayItemSalesList();
	    
		//출력
		for(Map<String, Object>  map : list) {
			System.out.println("-----------------");
			System.out.println("등록일자 : " + map.get("saledate"));
			System.out.println("등록번호 : " + map.get("seq"));
			System.out.println("상품코드 : " + map.get("itemcode"));
			System.out.println("상품이름 : " + map.get("itemname"));
			System.out.println("판매수량 : " + map.get("qty"));
			System.out.println("판매금액 : " + map.get("amount"));
		}
	}
	@Test
	void dayItemTotalSalestest() {
		SalesDAO sdao = new SalesDAO();
		List<Map<String, Object>> list  = sdao.dayItemTotalSales();
		
		//출력
		for(int i = 0; i < list.size(); i++) {
			System.out.println("--------------------------");
			System.out.println("등록일자 : " + list.get(i).get("saledate"));
			System.out.println("상품코드 : " + list.get(i).get("itemcode"));
			System.out.println("상품이름 : " + list.get(i).get("itemname"));
			System.out.println("판매수량 : " + list.get(i).get("qty"));
			System.out.println("판매금액 : " + list.get(i).get("amount"));
	
		}
	}
	@Test
	void Salesamount() {
		SalesDAO sdao = new SalesDAO();
		Scanner sr = new Scanner(System.in);
		System.out.print("조회 날짜 : ");
		String saledate = sr.next();
		
		List<Map<String, Object>>  list = sdao.Salesamount(saledate);
			
		for(Map<String, Object> map : list) {
			
			System.out.println("-----------------");
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("price")); 
			System.out.println(map.get("amount"));
			System.out.println(map.get("bigo")); 
			System.out.println(map.get("regdate"));
		  }
	}
	@Test
	void SalesView() {
		SalesDAO sdao = new SalesDAO();
		Scanner sr = new Scanner(System.in);
		System.out.print("조회 날짜 : ");
		String saledate = sr.next();
		saledate = saledate.substring(0, 4)+"-" 
				+ saledate.substring(4, 6)+"-"
				+ saledate.substring(6);
		
		List<Map<String, Object>>  list = sdao.Salesamount(saledate);
		
		for(Map<String, Object> map : list) {
			
			System.out.println("-----------------");
			System.out.println(map.get("itemcode"));
			System.out.println(map.get("itemname"));
			System.out.println(map.get("price")); 
			System.out.println(map.get("amount"));
			System.out.println(map.get("bigo")); 
			System.out.println(map.get("regdate"));
		}
	}

}
