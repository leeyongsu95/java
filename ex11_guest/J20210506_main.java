package ex11_guest;

import java.util.List;
import java.util.Scanner;


public class J20210506_main {

	public static void main(String[] args) {
		GuestDAO gdao = new GuestDAOImpl();
		
		while(true) {
			System.out.println("------------------------------");
			System.out.println("1. 방명록 작성");
			System.out.println("2. 방명록 조회");
			System.out.println("3. 한  건 조회");
			System.out.println("4. 방명록 수정");
			System.out.println("5. 방명록 삭제");
			System.out.println("9. 종료");
			System.out.println("------------------------------");
			
			Scanner sr = new Scanner(System.in);
			
			System.out.print("번호 선택 : ");
			int no = sr.nextInt();
			int cnt = 0; 
			
			if(no == 1) { //insert
				GuestDTO gdto = new GuestDTO("고기", "gogi@naver.com", "1234", "안녕하세요");
				cnt = gdao.insert(gdto);
				System.out.println(cnt + "건 추가");
				
			}else if (no == 2){ //select
				
				List<GuestDTO> glist = gdao.selectList();
				for(int i = 0; i < glist.size(); i++) {
					GuestDTO gdto = glist.get(i);
					
					System.out.println("==============================");
					System.out.println("번    호 : " + gdto.getSeq());;
					System.out.println("이    름 : " + gdto.getName());
					System.out.println("이 메 일 : " + gdto.getEmail());
					System.out.println("비밀번호 : " + gdto.getPasswd());
					System.out.println("내    용 : " + gdto.getContent());
					System.out.println("등록일자 : " + gdto.getRegdate());
					System.out.println("==============================");
				}
				
			}else if (no == 3){ //selectone
				GuestDTO gdto = gdao.selectOne(6);
				System.out.println("번    호 : " + gdto.getSeq());;
				System.out.println("이    름 : " + gdto.getName());
				System.out.println("이 메 일 : " + gdto.getEmail());
				System.out.println("비밀번호 : " + gdto.getPasswd());
				System.out.println("내    용 : " + gdto.getContent());
				System.out.println("등록일자 : " + gdto.getRegdate());
				
			}else if (no == 4) { //update
				GuestDTO gdto = new GuestDTO(3 , "고기", "gogi@naver.com", "1234", "11111", "21-05-06");
				cnt = gdao.update(gdto);
				System.out.println(cnt + "건 수정 완료");
				
			}else if (no == 5) { //delete
				GuestDTO gdto = new GuestDTO();
				System.out.print("삭제 할 번호 : ");
				int seq = sr.nextInt();
				cnt = gdao.delete(seq);
				System.out.println(cnt + "건 삭제 완료");
				
			}else if (no == 9) {
				DBConn.dbClose();
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
}
