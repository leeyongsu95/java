package ex01_class;

//회원 클래스
//필드 : 아이디, 비밀번호, 출생년도, 키
class Member{
	//은닉화 : private
	private String id;
	private String pw; //읽기 불가
	private int year;
	private double kidney;
	
	//생성자 : 객체가 생성될 때 실행되는 메서드
	//		   반드시 객체가 생성될 때 생성자가 실행이 되어야 한다.
	//클래스의 이름과 같다
	//반환형이 없다
	
	//기본 생성자
	//만약에 생성자가 없으면 컴파일러가 기본 생성자를 생성
	//만약에 생성자를 만들면 컴파일러가 기본 생성자를 생성하지 않음.
	//생성자의 오버로딩
	Member(){};
	Member(String id, String pw, int year, double kidney){
		this.id = id;
		this.pw = pw;
		this.year = year;
		this.kidney = kidney;
	}
	
	void setId(String id) {
		this.id = id;
	}
	//getter : 읽기
	String getId() {
		return id;
	}
	
	void setPw(String pw) {
		this.pw = pw;
	}
	String getPw() { //비밀번호 앞 두자리만 반환
		return pw.substring(0, 2) + "**";
	}
	
	void setYear(int year) {
		this.year = year;
	}
	int getYear() {
		return year;
	}
	
	
	void setKideny(double kidney) {
		this.kidney = kidney;
	}
	double getKideny() {
		return kidney;
	}
}



public class J20210419_05_Member {

	public static void main(String[] args) {
		Member mr = new Member(); //기본 생성자를 이용해서 객체를 생성
		mr.setId("ud11k");
		mr.setPw("1234");
		mr.setYear(1995);
		mr.setKideny(173.1);
		System.out.println("아 이 디 : " + mr.getId());
		System.out.println("비밀번호 : " + mr.getPw());
		System.out.println("출생년도 : " + mr.getYear() + "년");
		System.out.println("신    장 : " + mr.getKideny() + "cm");
		System.out.println("-------------------");
		
		Member mr2 = new Member("korea", "1111", 1950, 188.9);
		System.out.println("아 이 디 : " + mr2.getId());
		System.out.println("비밀번호 : " + mr2.getPw());
		System.out.println("출생년도 : " + mr2.getYear() + "년");
		System.out.println("신    장 : " + mr2.getKideny() + "cm");
	}

}
