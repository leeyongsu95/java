package ex11_guest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class GuestDAOImpl implements GuestDAO{
	PreparedStatement pt=null;
	ResultSet rt = null;
	int cnt = 0;
	
	@Override
	public int insert(GuestDTO gdto) {
		//추가
		Connection cn = DBConn.getConn();
		String sql = "INSERT INTO GUEST(SEQ, NAME, EMAIL, PASSWD, CONTENT) " + 
				"VALUES(GUEST_SEQ.NEXTVAL, ?, ?, ?, ?)";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, gdto.getName());
			pt.setString(2, gdto.getEmail());
			pt.setString(3, gdto.getPasswd());
			pt.setString(4, gdto.getContent());
			cnt = pt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return cnt;
	}
	
	@Override
	public int update(GuestDTO gdto) {
		//수정
		Connection cn = DBConn.getConn();
		String sql = "UPDATE GUEST " + 
				"SET NAME = ?, " +
				"	 EMAIL = ?, " + 
				"    PASSWD = ?, " + 
				"    CONTENT = ? " + 
				"WHERE SEQ = ?";
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, gdto.getName());
			pt.setString(2, gdto.getEmail());
			pt.setString(3, gdto.getPasswd());
			pt.setString(4, gdto.getContent());
			pt.setInt(5, gdto.getSeq());
			cnt = pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public int delete(int seq) {
		//삭제 
		Connection cn = DBConn.getConn();
		String sql = "DELETE GUEST  " + 
					 "WHERE SEQ = ?";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setInt(1, seq);
			cnt = pt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return cnt;
	}

	@Override
	public GuestDTO selectOne(int seq) {
		Connection cn = DBConn.getConn();
		GuestDTO gdto = null;
		String sql = "Select * from GUEST " + 
					 "WHERE SEQ = ?";
		try {
			pt = cn.prepareStatement(sql);
			pt.setInt(1, seq);
			rt = pt.executeQuery();
			if (rt.next()) {
				gdto = new GuestDTO();
				gdto.setSeq(seq);
				gdto.setName(rt.getString("name"));
				gdto.setEmail(rt.getString("email"));
				gdto.setPasswd(rt.getString("passwd"));
				gdto.setContent(rt.getString("content"));
				gdto.setRegdate(rt.getString("regdate"));
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return gdto;
	}

	@Override
	public List<GuestDTO> selectList() {
		List<GuestDTO> glist = new ArrayList<>(); 
		Connection cn = DBConn.getConn();
		String sql = "SELECT * FROM GUEST " + 
					 "ORDER BY SEQ";
		
		try {
			pt = cn.prepareStatement(sql);
			rt = pt.executeQuery();
			while(rt.next()) {
				GuestDTO gdto = new GuestDTO();
				gdto.setSeq(rt.getInt("seq"));
				gdto.setName(rt.getString("name"));
				gdto.setEmail(rt.getString("email"));
				gdto.setPasswd(rt.getString("passwd"));
				gdto.setContent(rt.getString("content"));
				gdto.setRegdate(rt.getString("regdate"));
				glist.add(gdto);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return glist;
	}


}
