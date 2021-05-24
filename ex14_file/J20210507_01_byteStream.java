package ex14_file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class J20210507_01_byteStream {

	public static void main(String[] args) {
		// 파일 읽고 쓰기
		//바이트 단위(stream)

		//1)파일 출력 
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("sample.txt");
			fout.write(97); //코드 값 
			fout.write('b');
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
			
		} finally {
			try {
				if (fout != null) fout.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		//2)파일 읽기 : 바이트 기반
		FileInputStream fin = null;
		try {
			fin = new FileInputStream("./data/sample.txt");
			//만약에 data가 -1이면 파일의 끝
			int data;
			
			while((data = fin.read()) != -1) {
				System.out.println((char)data);
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("파일이 없습니다.");
			e.printStackTrace();
			
		} catch (IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if (fin != null) fin.close();
			
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		
		
	}
}
