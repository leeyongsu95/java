//package java01;
//
//import java.util.Scanner;
//
//public class J20210414_02_while {
//
//	public static void main(String[] args) {
//		//실습) 사용자에게 반지름을 입력 받고 넓이를 구해봅시다.
//		//단 0 보다 작은 수를 입력한 경우 다시 입력 받고 
//		//0 을 입력 받으면 프로그램 종료
//		
//		//방법 1)
//		Scanner sc = new Scanner(System.in);
//		double won;
//		
//		while(true) {
//			
//			System.out.print("반지름 값은? : ");
//			won = sc.nextDouble();
//			
//			if (won == 0)	break;
//			System.out.println("원의 넓이 : " + won * won * 3.14);	
//		}
//		
//		
//		//방법 2)
//		Scanner sc = new Scanner(System.in);
//		double won = 1;
//		while(won != 0) {
//			System.out.print("반지름 값은? : ");
//			won = sc.nextDouble();
//			System.out.println("원의 넓이: " + won * won * 3.14);
//		}
//		
//		//방법 3)
//		Scanner sc = new Scanner(System.in);
//		double won; //반지름
//		do {
//			System.out.print("반지름 값은? : ");
//			won = sc.nextDouble();
//			System.out.println("원의 넓이: " + won * won * 3.14);
//		}while(won != 0);
//		
//		
//		//실습) 1 ~ n 까지의 수를 더하기
//		int s = 0, sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 수: ");
//		int n = sc.nextInt();
//		
//		while(true) {
//			s++;
//			if(s > n)break;
//			sum += s;
//		}
//		System.out.println("합 : " + sum);
//	}
//}
