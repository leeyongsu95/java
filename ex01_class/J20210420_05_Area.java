package ex01_class;

import java.util.Scanner;

//원 클래스
class Circle{
	private double radius;
	private double area;
	//생성자
	Circle(){};
	Circle(double radius){
		this.radius = radius;
		areaCal(radius); //생성자에서 메소드 실행
	}
	//게터
	double getArea() {
		return area;
	}
	//메소드
	double areaCal(double radius) { //원의 넓이 계산 메소드
		area = radius * radius * Math.PI;
		return area;
	}
	double areaCal(int radius) { //원의 넓이 계산 메소드
		area = radius * radius * Math.PI;
		return area;
	}
	double areaCal(double radius, double pi) { //원의 넓이 계산 메소드
		area = radius * radius *pi;
		return area;
	}
	@Override
	public String toString() {
		return "Circle [반지름 = " + radius + ", 원의 넓이 =" + area + "]";
	}
}

public class J20210420_05_Area {
	public static void main(String[] args) {
		Circle ce = new Circle(3.5);
		System.out.println(ce);
		System.out.println("원의 넓이 : " + ce.getArea());

		
		Scanner sr = new Scanner(System.in);
		System.out.print("원주율은? : ");
		
		double a = sr.nextDouble();
		System.out.println("원의 넓이 : " + ce.areaCal(10.5));
		System.out.println("원의 넓이 : " + ce.areaCal(10.5, 3.14));
		System.out.println("원의 넓이 : " + ce.areaCal(a));
	}

}
