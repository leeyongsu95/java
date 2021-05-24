package ex08_inher;

//부모 클래스
class MyCar{
	static final String name = "제네시스 G80";
}

//타이어
class Tire extends MyCar{
	private String company; //회사이름

	public Tire(String company) {
		super();
		this.company = company;
	}

	@Override
	public String toString() {
		return "타이어 회사 :" + company;
	}
}

//미러
class Mirror extends MyCar{
	private String cmirror; //백미러

	public Mirror(String cmirror) {
		super();
		this.cmirror = cmirror;
	}

	@Override
	public String toString() {
		return "백미러 회사 : " + cmirror;
	}
}

class Repair{
	//부품을 체인지 해주는 메소드
	//다형성을 이용
	void changPart(MyCar mycal) {
		System.out.println(mycal + "타이어 교체 완료");
	}
}

public class J20210504_02_Car {
	public static void main(String[] args) {
		System.out.println(MyCar.name);
		Tire te = new Tire("금호"); 
		/*System.out.println(te);*/
		
		Mirror mr = new Mirror("모비스");
		/* System.out.println(mr); */
		
		Repair rr = new Repair();
		rr.changPart(te);
		rr.changPart(mr);
	}

}
