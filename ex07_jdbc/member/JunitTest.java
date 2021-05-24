package ex07_jdbc.member;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

//단위 테스트
class JunitTest {
	MemberDAO mdao = new MemberDAO();
	
	@Test
	void testSelectList() {
		List<MemberDTO> mlist = mdao.selectList();
		System.out.println(mlist);
		assertNotEquals(0,mlist.size()); //데이터가 없으면 실패
	}

	@Test
	void testSelectOne() {
		String userid = "ID01";
		MemberDTO mdto = mdao.selectOne(userid);
		System.out.println(mdto);
		assertNotNull(mdto); //mdto가 null이 아닐때 성공
	}

	@Test
	void testInsert() {
		
		String userid = "ID09";
		String passwd = "PW09";
		int birtyear = 2001;
		
		MemberDTO mdto = new MemberDTO(userid, passwd, birtyear);
		
		int cnt = mdao.insert(mdto);
		
//		//cnt가 0이 아니면 성공
//		assertNotEquals(0, cnt);
		
		//cnt가 1이면 성공
		assertEquals(1, cnt);
	}

	@Test
	void testUpdate() {
		String userid = "ID09";
		String passwd = "PW09";
		int birtyear = 1995;
		
		MemberDTO mdto = new MemberDTO(userid, passwd, birtyear);
		
		int cnt = mdao.update(mdto);
		assertEquals(1, cnt);
	}

	@Test
	void testDelete() {
		String userid = "ID07";
		
		int cnt = mdao.delect(userid);
		
		assertEquals(1, cnt);
	}

}
