package ex11_guest;


import java.util.List;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class GuestJunitTest {
	int cnt = 0;
	GuestDAO gdao = new GuestDAOImpl();
	Scanner sr = new Scanner(System.in);
	
	@Test //추가
	void testInsert() {
		GuestDTO gdto = new GuestDTO("고기", "gogi@naver.com", "1234", "안녕하세요");
		cnt = gdao.insert(gdto);
		System.out.println(cnt + "건 추가");
	}

	@Test //수정
	void testUpdate() {
		GuestDTO gdto = new GuestDTO(4, "23", "gogi@naver.com", "1234", "11111", "21-05-06");
		cnt = gdao.update(gdto);
		System.out.println(cnt + "건 수정 완료");
	}

	@Test //삭제
	void testDelete() {
		GuestDTO gdto = new GuestDTO();
		System.out.print("삭제 할 번호 : ");
		int seq = sr.nextInt();
		cnt = gdao.delete(seq);
		System.out.println(cnt + "건 삭제 완료");
	}

	@Test //한건 조회
	void testSelectOne() {
		GuestDAO gdao = new GuestDAOImpl();
		GuestDTO gdto = gdao.selectOne(6);
		System.out.println("번    호 : " + gdto.getSeq());;
		System.out.println("이    름 : " + gdto.getName());
		System.out.println("이 메 일 : " + gdto.getEmail());
		System.out.println("비밀번호 : " + gdto.getPasswd());
		System.out.println("내    용 : " + gdto.getContent());
		System.out.println("등록일자 : " + gdto.getRegdate());
	}

	@Test //전체 조회
	void testSelectList() {
		List<GuestDTO> glist = gdao.selectList();
		for(int i = 0; i < glist.size(); i++) {
			GuestDTO gdto = glist.get(i);
			
			System.out.println("--------------");
			System.out.println("번    호 : " + gdto.getSeq());;
			System.out.println("이    름 : " + gdto.getName());
			System.out.println("이 메 일 : " + gdto.getEmail());
			System.out.println("비밀번호 : " + gdto.getPasswd());
			System.out.println("내    용 : " + gdto.getContent());
			System.out.println("등록일자 : " + gdto.getRegdate());
		}
	}

}
