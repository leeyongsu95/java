//package java01;
//
//public class J20210412_03_operator {
//
//	public static void main(String[] args) {
//		//연산자
//		
//		
//		//삼항 연산자
//		int a = 10;
//		
//		 String score = (a > 0)? "양수" : "음수";
//		 System.out.println(score);
//		
//		//실습) 두수중 큰 수를 출력;
//		int a = 60, b = 50;
//		int max = a < b? a : b;
//		System.out.println("큰값:" + max);
//		
//		//실습) 세수중 가장 큰 수 출력
//		//방법 1) 
//		int a = 90, b = 110, c = 100;
//		int max = a > b? a : b;
//		max = max < c? max : c;
//		//방법 2) 
//		int max = a > b? (a>c)? a : c : (b>c)? b : c; 
//		
//		System.out.println("큰값: " + max);
//		
//		//실습) 짝 홀수 출력하기
//		int odd = 10;
//		String s = odd % 2 == 0? "짝수" : "홀수";
//		System.out.println(s);
//		
//		//실습) 세 과목이 모두 60점이 넘으면 합격 아니면 불합격
//		int kor = 90, eng = 85, math = 59;
//		
//		//방법 1)
//		String score = (kor >= 60 && eng >= 60 && math >= 60)? "합격" : "불합격";
//		System.out.println(score);
//		
//		//방법 2)
//		System.out.println((kor >= 60 && eng >= 60 && math >= 60)? "합격" : "불합격");
//		
//	}
//
//}
