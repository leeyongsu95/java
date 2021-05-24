package ex01_class;

//결과 값이 저장되는 계산기
class NewCal{
	//필드 : maker, result(결과 값)
	String maker = "계산기";
	double result;
	
	//메소드 : 결과 값에 더하는 기능
	//오버로딩 : 매개 변수의 갯수나 형이 다른 경우 메소드의 이름을 중복가능
	void add (double a) {
		result += a;
	}
	double add(double a, double b) {
		return a + a;
	}
	void add(int a) {
		result += a;
	}
	
	
	
	
	void sub (double a) {
		result -= a;
	}
	void mul (double a) {
		result *= a;
	}
	void div (double a) {
		result /= a;
	}
}

public class J20210419_02_NewCal {

	public static void main(String[] args) {
		NewCal nc = new NewCal();
//		
//		nc.add(10);
//		System.out.println(nc.result);
//		nc.sub(3);
//		System.out.println(nc.result);
//		nc.mul(6.6);
//		System.out.println(nc.result);
//		nc.div(5.2);
//		System.out.println(nc.result);
//		
//		System.out.println(nc.add(20,10));
//		nc.add(100);
//		nc.add(100.12);
	
	
	
	}
}
