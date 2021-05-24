package ex07_jdbc.member;

import java.util.List;
import java.util.Scanner;

import ex07_jdbc.Countries;

public class J20210427_01_member {

	public static void main(String[] args) {
		boolean logincheck = false; //로그인 여부
		String login_userid = "게스트";
		// 객체 생성
		MemberDAO mdao = new MemberDAO();
		
		// member 데이터 추가
		while (true) {
			System.out.println("======================");
			System.out.println("[" + "현재 : " + login_userid + "]");
			System.out.println("======================");
			System.out.println("0.로 그 인");
			System.out.println("1.회원추가");
			System.out.println("2.회원수정");
			System.out.println("3.회원탈퇴");
			System.out.println("4.회원검색");
			System.out.println("5.전체조회");
			System.out.println("9.종    료");
			System.out.println("----------------------");
			
			Scanner sr = new Scanner(System.in);
			System.out.print("번호 선택 : ");
			int no = sr.nextInt();
			
			if(no == 0) { //로그인
				//userid, passwd 입력 받기
				System.out.print("아 이 디 : ");
				String userid = sr.next();
				System.out.print("비밀번호 : ");
				String passwd = sr.next();
				
				//userid 아이디가 존재 하지 않습니다.
				MemberDTO mdto = mdao.selectOne(userid);
				//System.out.println(mdto);
				if(mdto == null) {
					System.out.println("아이디가 존재하지 않습니다");
					logincheck = false;
					login_userid = "";
				}else if(passwd.equals(mdto.getPasswd())) {
					System.out.println("로그인 성공!");
					logincheck = true;
					login_userid = userid;
				}else {
					System.out.println("비밀번호가 일치하지 않습니다");
					logincheck = false;
					login_userid = "";
				}
				
				//passwd 패스워드 불 일치
				
				
				
			}else if (no == 5) {     //select
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //다시 처음으로 돌아감.
				}
				List<MemberDTO> mlist = mdao.selectList();
				for(int i = 0; i < mlist.size(); i++) {
					MemberDTO mdto = mlist.get(i);
					System.out.println("----------------------");
					System.out.println("아 이 디 : " + mdto.getUserid());
					System.out.println("비밀번호 : " + mdto.getPasswd());
					System.out.println("출생년도 : " + mdto.getBirthyear() + "년");
					System.out.println("등록일자 : " + mdto.getRegdate());
				}
			}else if (no == 4){ //selectone
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //다시 처음으로 돌아감.
				}
				System.out.println("--------------");
				System.out.print("아 이 디: ");
				String userid = sr.next();
				System.out.println("--------------");
				
				MemberDTO mdto = mdao.selectOne(userid);
				System.out.println("아 이 디 : " + mdto.getUserid());
				System.out.println("비밀번호 : " + mdto.getPasswd());
				System.out.println("출생년도 : " + mdto.getBirthyear() + "년");
				System.out.println("등록일자 : " + mdto.getRegdate());
				
			}else if (no == 1){ //insert
				
				System.out.println("--------------");
				
				String userid;
				while(true) {
					System.out.print("아 이 디: ");
					userid = sr.next();
					
					//아이디 중복체크
					MemberDTO mdto1 = mdao.selectOne(userid);
					
					if(mdto1 != null) //데이터가 있다면
						System.out.println("중복된 아이디");
					else break;
				}
				System.out.print("비밀번호: ");
				String passwd = sr.next();
				sr.nextLine(); //엔터 버퍼처리
				
				System.out.print("출생년도: ");
				String birthyearS = sr.nextLine();
				int birthyear = 0; //출생년도를 입력안하면 0으로 기본값
				if (!birthyearS.equals("")) //입력했다면
					birthyear =  Integer.parseInt(birthyearS); //문자를 숫자로 변환
				System.out.println("--------------");
				
				MemberDTO mdto = new MemberDTO(userid, passwd, birthyear);
				
				int cnt = mdao.insert(mdto);
				
				if(cnt > 0 ) {
					System.out.println("회원가입 완료");
				}else {
					System.out.println("회원가입 실패");
				}
				
			}else if (no == 2){  //update
				if(!logincheck) {
					System.out.println("로그인 후 사용 가능");
					continue; //다시 처음으로 돌아감.
				}
				System.out.println("--------------");
				
				System.out.print("아 이 디: ");
				String userid = sr.next();
				//로그인된 아이디 정보만 수정가능
				if(!login_userid.equals(userid)) {
					System.out.println("수정 권한이 없습니다.");
					continue;
				}
				//기존 정보 조회 후 수정 정보와 같이 전달
				MemberDTO mdto = mdao.selectOne(userid);
				String userpw;
				int birthyear;
				
				
				System.out.print("비밀번호: ");
				userpw = sr.next();
				sr.nextLine(); //엔터 버퍼처리
				
				System.out.print("출생년도: ");
				String birthyearS = sr.nextLine();
				birthyear = 0; //출생년도를 입력안하면 0으로 기본값
				if (!birthyearS.equals("")) //입력했다면
					birthyear =  Integer.parseInt(birthyearS); //문자를 숫자로 변환
				System.out.println("--------------");
				
				mdto = new MemberDTO(userid, userpw, birthyear);
				int cnt = mdao.update(mdto);
				
				if(cnt > 0 ) {
					System.out.println("회원수정 완료");
				}else {
					System.out.println("회원수정 실패");
				}
				
			}else if (no == 3) { //delect
				if(!logincheck) {
					System.out.println("로그인 후 탈퇴 가능");
					continue; //다시 처음으로 돌아감.
				}
				System.out.println("--------------");
				System.out.print("아 이 디: ");
				String userid = sr.next();

				//로그인된 아이디 정보만 수정가능
				if(!login_userid.equals(userid)) {
					System.out.println("삭제 권한이 없습니다.");
					continue;
				}
				System.out.println("--------------");
				
				int cnt = mdao.delect(userid);
				
				if(cnt > 0) {
					System.out.println("회원삭제 완료");
					login_userid = "";
				}else {
					System.out.println("회원삭제 실패");
				}
			
			}else if (no == 9) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
	}
}
