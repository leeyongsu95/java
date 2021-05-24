package ex12_inner;

class Dog{
	void walking() {
		System.out.println("걸을 수 있다");
	}
}

//class HuntDog extends Dog{
//	
//	@Override
//	void walking() {
//		System.out.println("걸을 수 없다");
//	}
//}

public class J20210507_02_anonymous {
	public static void main(String[] args) {
//		HuntDog hg = new HuntDog();
//		hg.walking();
		
		//익명 클래스 : 부모의 클래스로 재정의 해서 생성
		//일회성으로 쓸려고 할 때
		Dog hg= new Dog() {
			@Override
			void walking() {
				System.out.println("걸을 수 없다");
			}
			//오버 라이딩만 의미가 있다.
			void eating() {
				System.out.println("먹는다");
			}
		};
		hg.walking();
		
		
	}
}
