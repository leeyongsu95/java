package java01;

import java.util.Scanner;

public class J20210414_03_for {

	public static void main(String[] args) {
//		// 반복문(for)
//		
//		for(int i = 0; i < 10; i++) {
//			System.out.println(i);
//		}
//		
//		//실습) 1~ n 합 구하기
//		
//		int s = 0, sum = 0;
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("마지막 수 : ");
//		int c = sc.nextInt();
//		
//		
//		for(int i = 1; i < c; i++) {
//			s++;
//			sum += s;
//		}
//		System.out.println("총 합: " + sum);
//		
//		
//		
//		//실습) up down game 구현.
//		//1) 1 ~ 100 사이의 수 중 한개를 랜덤 추출.
//		//2) 사용자에게 정수 입력 받기.
//		//3) 랜덤 수와 비교해서 up 또는 down 출력.
//		//4) 2 ~ 3을 5을 반복
//		//5) 반복하면서 정답을 입력하면 사용자 승!
//		
//		//내가 한 방법)
//		int r = (int)(Math.random()*100 + 1);
//		System.out.println("랜덤 숫자 : " + r);
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("기회 몇번? : ");
//		int g = sc.nextInt();
//		int a;
//		boolean win = false;
//		
//		for(int i = 0; i < g; i++) {
//			System.out.printf("%d) 숫자를 입력하세요 : ", i + 1);
//	
//			if(!sc.hasNextInt()) {
//				sc.nextLine();
//				i--;
//				continue;
//			}
//			a = sc.nextInt();
//			
//			if(a < r) 
//				System.out.println("up 하세요.");
//					
//			else if(a > r) 
//				System.out.println("down 하세요.");
//				
//			else {
//				System.out.println("정답!! 사용자 승!");
//				win = true;
//				break;
//			}
//		}
//		if(!win) 
//			System.out.println("탈락.. 컴퓨터 승!");
//		
//		
//		
//		//방법 1)
//		int r = (int)(Math.random()*100 +1);
//		//System.out.println(r);
//		Scanner sc = new Scanner(System.in);
//		int a; 
//		boolean win = false; //성공여부(실패했다고 가정)
//		for(int i=0; i<7;i++) {
//			System.out.printf("%d)숫자를 맞춰라:", i+1);
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기
//				i--;
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			
//		}
//		if (!win) System.out.println("실패");
//		
//		
//		//방법 2)
//		int r = (int)(Math.random()*100 +1);
//		Scanner sc = new Scanner(System.in);
//		int a , cnt=0; //반복횟수
//		
//		boolean win = false; //성공여부(실패했다고 가정)
//		while(true) {
//			System.out.printf("%d)숫자를 맞춰라:", cnt+1);
//			if (!sc.hasNextInt()) { //입력한 값이 숫자가 아니면
//				sc.nextLine(); //버퍼 비우기
//				continue; //반복문의 처음으로 다시 돌아가서 계속 진행
//			}
//			a = sc.nextInt();
//			//업/다운/성공
//			cnt++; 
//			if (r>a) 
//				System.out.println("업");
//			else if(r<a) 
//				System.out.println("다운");
//			else {
//				System.out.println("성공");
//				win=true;
//				break;
//			}
//			if (cnt > 5) break;
//		}
//		if (!win) System.out.println("실패");
		
		
		
		
	
	}
}
	
