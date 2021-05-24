package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_03_update {

	public static void main(String[] args) {
		// 수정 : update
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		
		String itemcode = "8802";
		String itemname = "환타";
		
		
		String sql = "UPDATE ITEM\r\n" + 
					 "SET ITEMNAME  = ?\r\n" +  // 1번 내려오는 순서 
					 "WHERE ITEMCODE = ?";     // 2번
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, itemname);
			pt.setString(2, itemcode);
			
			int cnt = pt.executeUpdate();
			System.out.println(cnt + "건 수정");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
		
	}
}
