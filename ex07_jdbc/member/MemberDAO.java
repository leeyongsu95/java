package ex07_jdbc.member;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import ex07_jdbc.DBConn;

//DAO : 데이터 베이스 접근하는 메소드들의 모음
public class MemberDAO {

	//전체 조회
	List<MemberDTO> selectList(){
		List<MemberDTO> mlist = new ArrayList<>(); 
		Connection cn =  DBConn.getConn();
		PreparedStatement pt=null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER";
		try {
			pt = cn.prepareStatement(sql);
			rs = pt.executeQuery();
			while(rs.next()) {
				String userid = rs.getString("userid");
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear, regdate);
				mlist.add(mdto);
			}
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (pt != null) pt.close();
				if (cn != null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	
		return mlist;
	}
	
	//한건조회
	MemberDTO selectOne(String userid){
		MemberDTO mdto = null;
		Connection cn =  DBConn.getConn();
		PreparedStatement pt=null;
		ResultSet rs = null;
		String sql = "SELECT * FROM MEMBER\r\n" + 
				"WHERE USERID=?";
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, userid);
			rs = pt.executeQuery();
			if (rs.next()) {
				String passwd = rs.getString("passwd");
				int birthyear = rs.getInt("birthyear");
				Date regdate = rs.getDate("regdate");
				mdto = new MemberDTO(userid, passwd, birthyear, regdate);
			}
		} catch (java.sql.SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if (rs != null) rs.close();
				if (pt != null) pt.close();
				if (cn != null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return mdto;
		
	}
	
	//추가
	int insert(MemberDTO mdto) {
		int cnt = 0;   //적용 건수를 저장 할 변수
		
		//DB접속
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		String sql = "INSERT INTO MEMBER(USERID, PASSWD, BIRTHYEAR) "
				   + "VALUES(?, ?, ?)";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, mdto.getUserid());
			pt.setString(2, mdto.getPasswd());
			pt.setInt(3, mdto.getBirthyear());
			cnt = pt.executeUpdate();   //건 
			System.out.println(cnt + "건");
		
		} catch (SQLException e) {
			e.printStackTrace();
		
		}finally {   //컨넥션 종료
			try {
				if(pt != null) pt.close();
				if(cn != null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
	}
	
	//수정
	int update(MemberDTO mdto) {
		int cnt = 0;
		//DB접속
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		
		//String sql = "UPDATE MEMBER " + 
		//" SET  PASSWD = ?, " + 
		//" BIRTHYEAR = ? " + 
		//"WHERE USERID = ?";
		
		StringBuffer sql = new StringBuffer();
		sql.append("UPDATE MEMBER ");
		sql.append("SET  PASSWD = ?, ");
		sql.append(" BIRTHYEAR = ? ");
		sql.append("WHERE USERID = ?");

		System.out.println(sql);
		
		try {
			pt = cn.prepareStatement(sql.toString());
			pt.setString(1, mdto.getPasswd());
			pt.setInt(2, mdto.getBirthyear());
			pt.setString(3, mdto.getUserid());
			cnt = pt.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
			
		}finally {
			try {
				if(pt != null) pt.close();
				if(cn != null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		return cnt;
	}
	
	//삭제
	int delect(String userid) {
		int cnt = 0;
		Connection cn = DBConn.getConn();
		PreparedStatement pt = null;
		String sql = "DELETE MEMBER " + 
				     "WHERE USERID = ?";
		
		try {
			pt = cn.prepareStatement(sql);
			pt.setString(1, userid);
			cnt = pt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if(pt != null) pt.close();
				if(cn != null) cn.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return cnt;
	}

}
