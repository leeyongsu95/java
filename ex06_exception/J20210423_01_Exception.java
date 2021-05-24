package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210423_01_Exception {

	public static void main(String[] args) {
		//예외 처리
		//JVM이 해당하는 예외처리
//		Scanner sc = new Scanner(System.in);
//		
//		int a =10,b = 0;
//		
//		b = sc.nextInt();
//		System.out.println(a/b);
//		
//		while (true) {
//			System.out.print("나눌수를 입력?");
//			try { //예외발생 가능성 문장
//				b = sc.nextInt();
//				System.out.println(a/b);
//				break;
//			}catch(InputMismatchException e) {
//				System.out.println("숫자를 입력해 주세요");
//				sc.nextLine(); //버퍼 비우기
//				e.printStackTrace(); //예외발생된 지점 추적 출력
//			}catch(ArithmeticException e) {
//				System.out.println("0으로 나눌수 없습니다.");
//				e.printStackTrace();
//			}catch(Exception e) { //모든 예외를 처리:마지막에 처리
//				System.out.println("예외발생");
//				e.printStackTrace();
//			}
//		}
//		
//		System.out.println("프로그램 정상종료");
//		
//		//실습)
//		Scanner sr = new Scanner(System.in);
//		int[] arr = {10, 20, 30};
//		
//		//System.out.print("검색 할 번호는? : ");
//		//int ar = sr.nextInt();
//		//System.out.println(arr[ar - 1]);
//			while(true) {
//				System.out.print("검색 할 번호는? : ");
//				try {
//					int ar = sr.nextInt();
//					System.out.println(arr[ar - 1]);
//					break;
//				} catch (InputMismatchException e) {
//					System.out.println("숫자를 입력해 주세요");
//					sr.nextLine(); //버퍼 비우기
//					e.printStackTrace();
//				} catch(ArrayIndexOutOfBoundsException e) {
//					System.out.println("1~3 Index 번호 확인");
//					e.printStackTrace();
//				}catch(Exception e) { //모든 예외를 처리:마지막에 처리
//					System.out.println("예외발생");
//					e.printStackTrace();
//				}
//		}
//		System.out.println("프로그램 종료");
//		
//		
//		
//		
		//예외의 종류
		//1) 체크 예외 : RuntimeException을 상속하지 않은 예외
		//네트워크나 db나 파일 등 외부와 연결되는 것들
		//2) 언체크 예외 : RuntimeException을 상속한 예외
		File file = new File("sample.txt");
		System.out.println(file);
		try {
			Scanner sc = new Scanner(file);
			System.out.println("파일 검색 완료.");
			while(sc.hasNextLine()) {
				String s = sc.nextLine();
				System.out.println(s);
			}
		} catch (FileNotFoundException e) {
			System.out.println("파일을 찾을 수 없음.");
			e.printStackTrace();
		}
	
	}
}
