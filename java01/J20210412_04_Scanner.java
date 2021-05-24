package java01;

import java.util.Scanner;

public class J20210412_04_Scanner {

	public static void main(String[] args) {
		
		//사용자에게 입력 받기
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("숫자를 입력하세요 :");
//		
//		int a = sc.nextInt();
//		
//		System.out.println("입력 받은 값 :" + a);
//		
//		//반지름을 입력 받아 원의 넓이 구하기
//		Scanner own = new Scanner(System.in);
//		
//		System.out.print("반지름을 입력하세요 : ");
//		
//		double b = own.nextDouble();
//		//Math.PI : 원주율
//		System.out.printf("원의 넓이 : %.2f 입니다 ", b * b * Math.PI);
//		
//		//문자열을 입력 받을때
//		Scanner two = new Scanner(System.in);
//		System.out.print("이름은?");
//	    String name = two.next();
//	    System.out.println("당신의 이름은 : " + name);
		
		//실습) 나이와 이메일, 이름을 입력 받아 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.print("나이는?");
//		int age = sc.nextInt();
//		System.out.print("이메일은?");
//		String email = sc.next(); //문자열(공백, 엔터 기준)
//		sc.nextLine(); //엔터처리(버퍼를 비우기 위해서)
//		System.out.print("이름은?");
//		String name = sc.nextLine(); //엔터를 기준으로 문자열 읽기
//		
//		System.out.println(age + " " + email + " " + name);
		
		//실습) 반, 이름, 파이썬, C, 자바 점수를 입력 받아 
		//반, 이름, 총점과 평균을 구하여 출력.
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("반 이름은?");
//		String ban = sc.next();
//		
//		String name = sc.nextLine();
//		System.out.print("파이썬, C, 자바?");
//		
//		int python = sc.nextInt();
//		int c = sc.nextInt();
//		int java = sc.nextInt();
//		
//		System.out.println("------------");
//		System.out.println("반: " + ban);
//		System.out.println("이름: " + name);
//		
//		int sum = python + c + java;
//		double avg = (double)sum / 3;
//		
//		System.out.println("총점: " + sum);
//		System.out.println("평균: " + avg);
		
		String ban = "A";
		String name = "홍길동";
		
		int python = 90;
		int c = 88;
		int java = 96;
		
		System.out.println("------------");
		System.out.println("반: " + ban);
		System.out.println("이름: " + name);
		
		int sum = python + c + java;
		System.out.println("총점: " + sum);
		
		double avg = (double)sum / 3;
		System.out.println("평균: " + avg);
		
		System.out.println(avg * 100);
		System.out.println(Math.round(avg * 100));
		System.out.println((double)Math.round(avg * 100)/100);
		
		//format 메소드 이용
		System.out.println("포맷 메소드" + String.format("%.2f", avg) );
	}

}
