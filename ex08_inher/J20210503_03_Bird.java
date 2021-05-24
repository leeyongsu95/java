package ex08_inher;

//부모 클래스
//final 클래스는 상속 불가
class Bird{
	private String name;
	Bird(String name){
		this.name = name;
	}
	String getName() {
		return name;
	}
	void born() {
		System.out.println("알을 낳는다");
	}
	//final void fly() : final 메소드는 오버라이딩 불가
	void fly() {
		System.out.println("날아갈 수 있다!");
	}
}
//참새
class Sparrow extends Bird {
	Sparrow(String name) {
		super(name);
	}
	private String name = "참새";
	
	@Override
	void fly() {
		System.out.println(name + "날아갈 수 있다!");
	}
}
//타조
class Ostrich extends Bird {
	Ostrich(String name) {
		super(name);
	}
	private String name = "타조";
	//오버 라이딩 : 부모 클래스의 메소드를
	@Override
	void fly() {
		System.out.println(name + "날아갈 수 없다!");
	}
	
}
public class J20210503_03_Bird {

	public static void main(String[] args) {
		Sparrow sw = new Sparrow("참새");
		sw.born();
		sw.fly();
		
		Ostrich oh = new Ostrich("타조"); 
		oh.born();
		oh.fly();
		
		Object o2 = new Ostrich("타조"); //업캐스팅(자동으로 형 변환)
		Ostrich o3 = (Ostrich)o2; //다운캐스팅     (수동으로 형 변환)
		o3.fly();
		
	}

}
