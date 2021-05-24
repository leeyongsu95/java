package ex01_class;
//핸드폰 클래스
//필드: 이름(name), 용량(capacity), 화소(pixel)
//생성자, 게터, 세터, toString
class Phone{
	private String name;
	private int capacity;
	private int pixel;
	//생성자
	public Phone() {}
	public Phone(String name, int capacity, int pixel) {
		//나자신의 생성자 호출, 반드시 가장 먼저 실행
		this(name, capacity); 
		this.pixel = pixel;
	}
	public Phone(String name, int capacity) {
		this.name = name;
		this.capacity = capacity;
	}
	
	public Phone(String name) {
		this.name = name;
	}
	
	//게터/세터
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCapacity() {
		return capacity;
	}
	public void setCapacity(int capacity) {	
		this.capacity = capacity;
	}
	public int getPixel() {
		return pixel;
	}
	public void setPixel(int pixel) {
		this.pixel = pixel;
	}
	@Override
	public String toString() {
		return "Phone [name=" + name + ", capacity=" + capacity + ", pixel=" + pixel + "]";
	}
}

public class J20210420_02_Phone {
	public static void main(String[] args) {
		Phone p1 = new Phone("갤럭시", 512, 12000);
		System.out.println(p1);
		//p1.setCapacity(256);
	}

}
