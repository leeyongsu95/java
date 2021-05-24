package ex09_abstract;

import java.util.Scanner;

interface Call{
	void call();
}

interface Photo{
	void photo();
}

interface Memo{
	void memo();
}

//전화, 사진찍기
class Phone implements Call, Photo{

	@Override
	public void call() {
		System.out.println("LTE 전화 걸기");
	}

	@Override
	public void photo() {
		System.out.println("6500만 화소 카메라 실행");
	}
	
}

//전화, 사진 찍기, 메모
class NewPhone implements Call, Photo, Memo{

	
	@Override
	public void call() {
		System.out.println("5G 전화 걸기");
	}

	@Override
	public void photo() {
		System.out.println("1억 800만 화소 카메라");
	}

	@Override
	public void memo() {
		System.out.println("메모장 실행");
	}
	
}

//폰 사용
class PhoneUse{
	void call(Call call) {
		call.call();
	}
	void photo(Photo photo) {
		photo.photo();
	}
	void memo(Memo memo) {
		memo.memo();
	}
}

public class J20210504_03_Phone {

	public static void main(String[] args) {
		PhoneUse pue = new PhoneUse(); 
		Phone pe = new Phone();
		NewPhone ne = new NewPhone();
		int no;
		Scanner sr;
		
		
		while(true) { //구형폰 
			System.out.println("----메뉴----");
			System.out.println("1. 전화");
			System.out.println("2. 사진");
			System.out.println("------------");
			
			sr = new Scanner(System.in);
			System.out.println("------------");
			System.out.print("기능 선택 : ");
			no = sr.nextInt();
				
			if(no == 1) { //전화 기능
				pue.call(pe);
			}else if (no == 2) { //사진 기능
				pue.photo(pe);
			}
		}
		
//		while(true) { //최신폰 
//			System.out.println("----메뉴----");
//			System.out.println("1. 전화");
//			System.out.println("2. 사진");
//			System.out.println("3. 메모");
//			System.out.println("------------");
//			
//			sr = new Scanner(System.in);
//			System.out.println("------------");
//			System.out.print("기능 선택 : ");
//			no = sr.nextInt();
//				
//			if(no == 1) { //전화 기능
//				pue.call(ne);
//			}else if (no == 2) { //사진 기능
//				pue.photo(ne);
//			}else if (no == 3) { //메모기능
//				pue.memo(ne);
//			}
//		}
	
	
	}
}
