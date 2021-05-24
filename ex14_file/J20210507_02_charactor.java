package ex14_file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class J20210507_02_charactor {

	public static void main(String[] args) {
		//문자기반: 문자데이터의 입출력을 다루는 스트림
		//char형 변수 : 2byte
		//자바는 모든문자를 유니코드를 기준으로 표현
		
//		char c = '홍';
//		System.out.println(c);
		
		//문자 단위로 쓰기
		//try-with 문
//		try (FileWriter fw = new FileWriter("./data/charSample.txt")){
//			fw.write('A');
//			fw.write("자바");
//			fw.write("good");
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//파일 읽기
//		int ch;
//		try(FileReader fr = new FileReader("./data/charSample.txt")){
//			while((ch = fr.read()) != -1) {
//				System.out.println((char)ch);
//			}
//			
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		
//		
//		//실습) 좋아하는 칼라를 입력 받아 파일을 만들고
//		try(FileWriter fr = new FileWriter("./data/color.txt")){
//			fr.write("black");
//			fr.write(" ");
//			fr.write("red");
//			fr.write(" ");
//			fr.write("blue");
//			
//		} catch (IOException e) {
//			e.printStackTrace();
//		}
//		
//		//파일을 읽어서 리스트를 출력
//		int ch;
//		try(FileReader fr = new FileReader("./data/color.txt")){
//			while((ch = fr.read()) != -1) {
//				System.out.println((char)ch);
//			}
//			
//			} catch (FileNotFoundException e) {
//				e.printStackTrace();
//				
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		
		//실습) 이름과 점수를 입력 받아 파일에 저장하고
		try(FileWriter fr = new FileWriter("./data/sum.txt")){
			Scanner sr = new Scanner(System.in);
			
			System.out.print("이름 : ");
			fr.write(sr.next());
			
			System.out.print("국어 점수 : ");
			fr.write(sr.next());
			
			System.out.print("영어 점수 : ");
			fr.write(sr.next());
			
			System.out.print("수학 점수 : ");
			fr.write(sr.next());
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}

		
		//파일을 읽어서 합계와 평균을 구하기
		int ch;
		try(FileReader fr = new FileReader("./data/sum.txt")){
			while((ch = fr.read()) != -1) {
				System.out.println(Integer.parseInt("90" + "80" + "70") / 3);
			}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
}
