package ex07_jdbc;

import java.sql.Connection;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class J20210427_01_emp {

	public static void main(String[] args) {
		//사원(employees) 테이블에서 년봉(salary)이 10000이상 사원
		//employee_id, first)name, hire_date, salary 조회
		//년봉의 내림차 순으로 정렬
		
		Connection con = DBConn.getConn();
		Statement st = null;
		ResultSet rs = null;
		List<EmployeesDTO> list = new ArrayList<>();
		
		try {
			String sql = "SELECT EMPLOYEE_ID, FIRST_NAME, HIRE_DATE, SALARY \r\n" + 
					"FROM EMPLOYEES \r\n" + 
					"WHERE SALARY >= 10000\r\n" + 
					"ORDER BY SALARY DESC\r\n" + 
					"";
			st = con.createStatement();
			rs = st.executeQuery(sql);
			
			//sql 실행 테스트
			//System.out.println("SQL문 실행완료.");
			
			while (rs.next()) {
				int employee_id = rs.getInt("employee_id");
				String first_name = rs.getString("first_name");
				Date  hire_date = rs.getDate("hire_date");
				int salary = rs.getInt("salary");
				
				EmployeesDTO eo = new EmployeesDTO();
				eo.setEmployee_id(employee_id);
				eo.setFirst_name(first_name);
				eo.setSalary(salary);
				eo.setHire_date(hire_date);
				list.add(eo);
			}
		} catch (Exception e) {
			System.out.println("sql 예외");
			e.printStackTrace();
		
		} finally { // 예외가 발생 하던 안하던 무조건 실행.
			try {
				if (rs != null) rs.close();  	//컨넥션 종료
				if (st != null) st.close();	 	//컨넥션 종료
				if (con != null) con.close();	//컨넥션 종료	
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		//list 출력 테스트
		//System.out.println(list);
		for(int i = 0; i < list.size(); i++) {
			EmployeesDTO edto = list.get(i);
			System.out.println(edto.getEmployee_id() + " " 
							 + edto.getFirst_name() + " " 
							 + edto.getSalary() + " "
			                 + edto.getHire_date());
		}
	}
}
