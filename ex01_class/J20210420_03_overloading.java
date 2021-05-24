package ex01_class;

import java.util.Arrays;

class Sum{
	//두정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b) {
		return a + b;
	}
	//세정수를 매개변수로 받아서 합을 리턴하는 메소드
	int add(int a, int b, int c) {
		return a + b + c;
	}
	//배열을 매개 변수로 받아서 합을 마지막 index에 넣고 리턴하는 메소드
	int add(int[] args) {

		//test
		System.out.println(Arrays.toString(args));
		
		int sum = 0;
		for(int i = 0; i < args.length; i++) {
			sum += args[i] ;
		}
		args[args.length-1] = sum; //마지막 index에 합계 넣기
		return sum;
	}
	
	//가변인자
	int add1(int... arr) {
		int sum = 0;
		//test
		//System.out.println(Arrays.toString(args));
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i] ;
		}
		return sum;
	}
	
	//문자열을 가변인자로 받아서 출력
	void addVargrgs(String... sr) {
		for(String s : sr) {
			System.out.print(s);
		}
		
	}
}

public class J20210420_03_overloading {

	public static void main(String[] args) {
		Sum s = new Sum();
		
//		System.out.println(s.add(10, 20));
//		System.out.println(s.add(10, 20, 30));
//		
		int[] arr = {10, 20, 30, 40, 0};
		System.out.println("합계 : " + s.add(arr));
		System.out.println(Arrays.toString(arr));
		
		
		//가인인자
//		System.out.println("합계 : " + s.add1(10, 20, 30, 40, 50));
//		s.addVargrgs("안", "녕", "하", "세", "요");
	}

}
