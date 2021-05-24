package ex08_inher;

class Animal{
}

//토끼
class Rebbit extends Animal{
	@Override
	public String toString() {
		return "토끼";
	}
}
//사자
class Lion extends Animal{
	@Override
	public String toString() {
		return "사자";
	}
}

class AnimalCare{
	//먹이 메소드
	void eating(Animal al) {
		System.out.println(al + "먹이주기");
	}
	//목욕 메소드
	void washing(Animal al) {
		System.out.println(al + "목욕시키기");
	}
}


public class J20210504_03_Animal {

	public static void main(String[] args) {
		//객체 생성
		AnimalCare ce = new AnimalCare();
		Rebbit rt = new Rebbit();
		Lion ln = new Lion();
		
		//메소드 실행
		ce.eating(rt);
		ce.washing(rt);
		ce.eating(ln);
		ce.washing(ln);
		
	}

}
