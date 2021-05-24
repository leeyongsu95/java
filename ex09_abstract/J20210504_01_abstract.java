package ex09_abstract;
 //부모클래스
//추상메소드를 한개라도 가지고 있으면 추상 클래스로 만들어야 함
abstract class Education{
	static String name = "교육청";
	//구현부가 없는 추상메소드
	//자식이 반드시 구현부를 작성
	abstract void schoolName();
}
//초등학교
class Elementary extends Education{

	@Override
	void schoolName() {
		System.out.println("하울 초등학교");
	}
}

//중학교
class Middle extends Education{
	
	@Override
	void schoolName() {
		System.out.println("바울 중학교");
	}
}

//고등학교
class High extends Education {
	
	@Override
	void schoolName() {
		System.out.println("고울 고등학교");
	}
}

class EduInfo{
	//출신 학교 출력
	void schoolNamePrint(Education edu) {
		//다운캐스팅
//		if (edu instanceof High)
//			((High)edu).schoolName(); 
//		else if (edu instanceof Middle)
//			((Middle)edu).schoolName();
//		else if (edu instanceof Elementary)
//			((Elementary)edu).schoolName();
		
		//다형성을 이용해서 출력
		//실제로 출력은 자식 클래스의 메소드를 실행
		edu.schoolName();
		
	}
}

public class J20210504_01_abstract {
	public static void main(String[] args) {
		Elementary elem = new Elementary();
		Middle midd = new Middle();
		High high = new High();
		EduInfo info = new EduInfo();
		info.schoolNamePrint(elem);
		info.schoolNamePrint(midd);
		info.schoolNamePrint(high);
		
			
	}

}
