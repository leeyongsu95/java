package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class J20210427_02_insert {

	public static void main(String[] args) {
		Connection cn = DBConn.getConn();
		//Statement st = null;
		
		//sql문을 간결하게, 보안에 우수
		PreparedStatement pt = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("상품 코드 : ");
		String itemcode = sc.next();
		sc.nextLine(); //엔터 값 처리
		
		System.out.print("상품 이름 : ");
		String itemname = sc.nextLine();
		
		System.out.print("상품 가격 : ");
		int price = sc.nextInt();
		
		//String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE )VALUES"
		//		+ "('" + itemcode + "', '" + itemname + "'," + price + ")";
		
		String sql = "INSERT INTO ITEM (ITEMCODE, ITEMNAME, PRICE) VALUES(?,?,?)";
		System.out.println(sql);
		
		try {
			pt = cn.prepareStatement(sql);
			//sql 문의 ?에 값 대치
			pt.setString(1, itemcode);
			pt.setString(2,  itemname);
			pt.setInt(3, price);
			
			int cnt = pt.executeUpdate(); //적용된 건수를 반환
			
			//st = cn.createStatement();
			//int cnt = st.executeUpdate(sql); //적용된 건수를 반환
			
			System.out.println(cnt + "건 추가");
		} catch (SQLException e) {
			System.out.println("sql문 예외");
			e.printStackTrace();
		}
	
	
	}
}
