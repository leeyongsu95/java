package ex06_exception;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class J20210423_02_throws {

	//예외 처리 메소드
	static void arrayIndex(int index) {
		int[] arr = {10, 20, 30};
		
		try {
			System.out.println(arr[index]);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("잘못된 번호입니다.");
			
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
	}
	
	//예외를 던진다. //언체크 예외
	static void arrayIndex_throws(int index) throws ArrayIndexOutOfBoundsException{
		int[] arr = {10, 20, 30};
		System.out.println(arr[index]);
	}
	
	//파일을 읽기 메소드
	//예외 던짐 //체크 예외
	static void filRead(String filename) throws FileNotFoundException {
		File file = new File(filename);
		System.out.println(file);
		Scanner sc = new Scanner(file);
		System.out.println("파일 검색 완료.");
		
		while(sc.hasNextLine()) {
			String s = sc.nextLine();
			System.out.println(s);
		}
	}
	
	public static void main(String[] args) {
		
		//J20210423_02_throws.arrayIndex(3);
		
		// throws : 예외 던지기
		try {
			J20210423_02_throws.arrayIndex(3);
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("throws로 처리 : 잘못된 번호입니다.");
			
		} catch(Exception e) {
			System.out.println("예외 발생");
		}
		try {
			J20210423_02_throws.filRead("sample.txt");
		} catch (Exception e) {
			System.out.println("잘못된 파일명");
			e.printStackTrace(); //오류 출력
		}
	}
}
