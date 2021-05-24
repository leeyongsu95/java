package ex07_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class J20210426_01_select {
	static Connection conn; //필드 : 자동 초기화
	public static void main(String[] args) {
		// 오라클 db 연결
		//Connection conn = null; //지역 변수 반드시 초기화 필수
		try {
			
			//드라이버 연결
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Loding complete!");
			
			//oracle 접속 
			conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "hr", "hr");
			System.out.println("Loding success!");
		
		} catch (ClassNotFoundException e) { 
			//드라이버 없음 예외 처리
			System.out.println("OracleDriver missing!");
			e.printStackTrace();
		
		} catch (SQLException e) { 
			//드라이버 접속 실패 예외 처리
			System.out.println("Oracle missing!");
			e.printStackTrace();
		} 
		if (conn == null) return; //컨넥션 실패시 종료
		
		
		List<Countries> list = new ArrayList<>();
		ResultSet rt = null;
		Statement st = null;
		try { //db 정보 select
			st = conn.createStatement();
			String sql = "SELECT * FROM COUNTRIES";
			rt = st.executeQuery(sql); //조회
			
			while(rt.next()) {
				
				//index no로 호출 가능. 
				String country_id   = rt.getString("country_id");
				String country_name = rt.getString("country_name");
				int region_id       = rt.getInt("region_id");
				Countries cot = new Countries(country_id, country_name, region_id);
				list.add(cot);
			}
			
		} catch (SQLException e) {
			System.out.println("SQL 문 예외");
			e.printStackTrace();
		
		} finally { // 예외가 발생 하던 안하던 무조건 실행.
			try {
				if (rt != null) rt.close();  	//컨넥션 종료
				if (st != null) st.close();	 	//컨넥션 종료
				if (conn != null) conn.close();	//컨넥션 종료	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		//출력
		for(int i = 0; i < list.size(); i++) {
			Countries cs = list.get(i);
			System.out.println(cs.getCountry_id() + 
						 " " + cs.getCountry_name() + 
						 " " + cs.getRegion_id());
		
		}
		//for each문 방법
//		for(Countries c : list) {
//			System.out.println(l.getCountry_id() + 
//						 " " + l.getCountry_name() + 
//						 " " + l.getRegion_id());
//		}
	}
}
