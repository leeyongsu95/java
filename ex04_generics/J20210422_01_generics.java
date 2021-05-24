package ex04_generics;


//사각형 클래스
//필드 : 가로(int), 세로(int), 넓이(int)
//제네릭 타입 : 인스턴스 생성시 형을 결정
//T : Type, K : Key, V : Value, E : Element
class Rectangle<T>{
	private T width;
	private T height;
	private double area;
	public Rectangle(T width, T height) {
		this.width = width;
		this.height = height;
		area = getArea(width, height);
	}
	public T getWidth() {
		return width;
	}
	public void setWidth(T width) {
		this.width = width;
	}
	public T getHeight() {
		return height;
	}
	public void setHeight(T height) {
		this.height = height;
	}
	public double getArea(T width, T height) {
		double result = 0;
		if (width instanceof Integer) { //width가 Integer형이라면
			result =(int)width * (int)height;
		}else if (width instanceof Double)
			result =(double)width * (double)height;
		
		return result;
	}
	@Override
	public String toString() {
		return "Rectangle [가로 = " + width + ", "
						+ "세로 = " + height + ","
						+ "넓이 = " + area + "]";
	}
}

public class J20210422_01_generics {

	public static void main(String[] args) {
		Rectangle<Integer> re = new Rectangle<>(3, 8);
		System.out.println(re);
		
		Rectangle<Double> re2 = new Rectangle<>(3.3, 8.8);
		System.out.println(re2);
	}

}
