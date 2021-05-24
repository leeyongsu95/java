package java01;

import java.util.Scanner;

public class J20210414_04_training {

	public static void main(String[] args) {
	//실습 1)
	//➢ 사용자가 ‘Y’를 입력하면 계속 음악을 재생 메세
	//지를 출력하는 프로그램을 만들어 봅시다
	//➢ 예)
	//음악을 재생할까요? Y
	//음악을 1번 재생합니다
	//음악을 재생할까요? Y
	//음악을 2번 재생합니다
	//음악을 재생할까요? 
		
		

	
	//for문 방식
		
//		Scanner sc = new Scanner(System.in);
//		String music;
//	for(int i = 1; i > 0; i++) {
//		System.out.printf("%d) Should I play music?", i);
//		music = sc.next();
//		if(music.equals("y")) {
//			System.out.println("Music play!");
//			
//		}else if (music.equals("n")) {
//			System.out.println("Music end..");
//		}else {
//			System.out.println("This is an invalid character. :( ");
//			break;
//		}
//	}
	
	
	
	//while 방식
		
//		Scanner sc = new Scanner(System.in);
//		String music;
//	while(true) {
//		System.out.print("Should I play music?");
//		music = sc.next();
//		if(music.equals("y")) {
//			System.out.println("Music play!");
//			
//		}else if (music.equals("n")) {
//			System.out.println("Music end..");
//			break;
//		}else {
//			System.out.println("This is an invalid character. :( ");
//			break;
//		}
//	}
	
		//실습 2) 구구단

//		int sum;
//		
//		for(int i = 2; i < 10; i++) {
//			System.out.println("=====" + i + "단" + "=====");
//			
//			for(int j = 1; j < 10; j++) {
//				sum = i * j;
//				System.out.println(i + " * " +  j + " = " + sum);
//			}
//		}
	
		//실습 3) 소수 구하기
		//양의 정수를 입력 받아 정수가 소수인지 검사하시오
		//(소수란 1과 자기 자신만으로 나누어 떨어지는 수)
		//예) 양의 정수? 10
		//10은 소수가 아닙니다
		
		//방법 1)
//		Scanner sc = new Scanner(System.in);
//		boolean t = true; //소수 여부
//		
//		System.out.print("양의 정수는? : ");
//		int number = sc.nextInt();
//		
//		for(int i = 2; i < number; i++) {
//			if(number % i == 0) {  
//				System.out.println("소수가 아닙니다.");
//				t = false;
//				break;
//			}
//		}
//		if (t) {
//		System.out.println("소수 입니다");
//		}
		
		//방법 2)
//		Scanner sc = new Scanner(System.in);
//		int i;
//		System.out.print("양의 정수는? : ");
//		int number = sc.nextInt();
//		
//		for(i = 2; i < number; i++) {
//			if(number % i == 0) {  
//				System.out.println("소수가 아닙니다.");
//				break;
//			}
//		}
//		if (i == number) {
//		System.out.println("소수 입니다");
//		}
		
	
		
		//실습)
		//n을 입력 받아 1부터 n사이의 모든 소수를 출력
		//예) 양의 정수? 100
		//2 3 5 7 .......83 89 97
		
		Scanner sc = new Scanner(System.in);
		System.out.print("양의 정수는? : ");
		int number = sc.nextInt();
		boolean t; //소수 여부
		
		for (int j = 2; j < number; j++) {
			t = true; //소수라고 가정하고 시작
			for(int i = 2; i < j; i++) {
				if(j % i == 0) {
//					System.out.println(j + " " + "소수가 아닙니다");
					t = false; 
					break;
				}
			}
			if(t) {
				System.out.print(j + " ");
			}
		}
		
		
	}
}
