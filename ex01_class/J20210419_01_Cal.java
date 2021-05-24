package ex01_class;


//계산기
class Cal{
	//속성 : 필드
	String maker = "국제 계산기";
	
	//기능 : 메소드
	int add(int a, int b) { //더하기 : 더한값을 리턴
		return a + b;
	}
	int sub(int a, int b) {
		return a - b;
	}
	int mul(int a, int b) {
		return a * b;
	}
	double div (int a, int b) {
		return (double)a / b;
	}
}


public class J20210419_01_Cal {
	
	public static void main(String[] args) {
		Cal c1 = new Cal();
		
		System.out.println(c1.maker);
		
		int a = 20, b = 3;
		
		System.out.println(" + : " + c1.add(a, b));
		System.out.println(" - : " + c1.sub(a, b));
		System.out.println(" x : " + c1.mul(a, b));
		System.out.println(" / : " + c1.div(a, b));
		
	}
}
