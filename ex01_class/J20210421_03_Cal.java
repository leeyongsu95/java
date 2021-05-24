package ex01_class;



public class J20210421_03_Cal {
	
	private int result;
	private static boolean light;
	//두수를 매개 변수로 받아서 합을 리턴하는 메소드
	//static 메소드 안에서는 static 필드만 사용 가능
	static int add(int a, int b) {
		return a + b;
	}
	int add(int a) {
		this.result += a;
		return result;
	}
	
	//라이트 켜기 / 끄기
	static boolean light(boolean a) {
		light = a != true;
		return light;
	}
	
	
	public static void main(String[] args) {
//		J20210421_03_Cal cl = new J20210421_03_Cal();
//		System.out.println("합계 : " + cl.add(10, 20));
	
		
		//static 
		System.out.println("합계 : " + J20210421_03_Cal.add(40, 20));
		
		System.out.println("라이트 켜짐 " + J20210421_03_Cal.light(false));
		System.out.println("라이트 꺼짐 " + J20210421_03_Cal.light(true));
	}
}
