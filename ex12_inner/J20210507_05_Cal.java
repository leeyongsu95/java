package ex12_inner;

interface Cal{
	int add(int a, int b);
//	int sub(int a, int b);
}

public class J20210507_05_Cal {

	public static void main(String[] args) {
		Cal cl1 = new Cal(){

			@Override
			public int add(int a, int b) {
				return a + b;
			}

//			@Override
//			public int sub(int a, int b) {
//				return a - b;
//			}
		};
		System.out.println("a + b = " + cl1.add(10, 20));
//		System.out.println("a - b = " + cl.sub(40, 30));
		
		//람다식
		//한개의 추상 메소드만 가지고 있어야 한다. (함수적 인터페이스)
		Cal cl2 = (a, b)-> a + b; 
		System.out.println("a + b = " + cl2.add(30, 20));
	}
}
