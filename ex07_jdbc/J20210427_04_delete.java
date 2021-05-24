package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J20210427_04_delete {

	public static void main(String[] args) {
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		
		String itemcode = "8806";
		String sql = "DELETE FROM ITEM\r\n" + 
					 "WHERE ITEMCODE = ?";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, itemcode);
			int cnt = pt.executeUpdate();
			System.out.println(cnt + "건 삭제");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}

		
	}
}
