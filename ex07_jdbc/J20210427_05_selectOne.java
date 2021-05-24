package ex07_jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;

public class J20210427_05_selectOne {

	public static void main(String[] args) {
		//한건만 조회
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		ResultSet rt = null;
		ItemDTO idto = null;
		
		String itemcode = "8801";
		String sql = "SELECT * FROM ITEM\r\n" + 
					 "WHERE ITEMCODE = ?";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, itemcode);
			rt = pt.executeQuery();
			if (rt.next()) { //데이터가 있다면
				String itemname = rt.getString("itemname");
				int price = rt.getInt("price");
				String bigo = rt.getString("bigo");
				Date regdate = rt.getDate("regdate");
				idto = new ItemDTO(itemcode, itemname, price, bigo, regdate);

			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		//item 출력
		System.out.println(idto.getItemcode() + " " + idto.getItemname()
				   + " " + idto.getPrice() + " " + idto.getBigo() 
				   + " " + idto.getRegdate());
	}

}
