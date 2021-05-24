package ex01_class;


//객체를 만들어 내기 위한 틀
//clss
class Dog {
	//속성 : 필드 
	//자동 초기화
	String type = "강아지, 고양이";
	String name = "아라, 꼬미, 밤톨, 두부, 뚱이가 ";
	int legs = 4;
	int cnt;         // 걸음수
	
	
	//기능 : 메소드
	void walking() {
		cnt++;
		System.out.println(name + "걷는다");
	}
	void eat() {
		System.out.println(name + "사료를 먹는다");
	}
	
}
public class J20210416_03_class {
	public static void main(String[] args) {
		
		Dog d1 = new Dog();
		System.out.println(d1.type);
		System.out.println(d1.legs);
		
		d1.walking();
		d1.eat();
		System.out.println(d1.cnt);
		
		
	}
}
