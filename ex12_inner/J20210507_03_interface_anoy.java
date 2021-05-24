package ex12_inner;

//인터페이스 객체 생성 안됨
interface School{
	void namePrint();
}

//class HighSchool implements School{
//
//	@Override
//	public void namePrint() {
//		System.out.println("국제 고등학교");
//	}
//}

public class J20210507_03_interface_anoy {

	public static void main(String[] args) {
//		HighSchool hs = new HighSchool();
//		hs.namePrint();
		//익명 클래스 생성
		//School 인터 페이스를 상속을 받은 객체 생성
		School high = new School() {

			@Override
			public void namePrint() {
				System.out.println("국제 고등학교");
			}
		};
		high.namePrint();
	
	}
}
