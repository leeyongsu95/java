package ex01_class;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

//수강생 클래스
//필드 : 코드, 이름, 수강과목
class Attendee{
	private String code;
	private String name;
	private String title;

	
	public Attendee(String code, String name, String title) {
		super();
		this.code = code;
		this.name = name;
		this.title = title;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
}
//수강 클래스 : LectureManger
class LectureManger{
	//클래스 필드, 클래스 변수
	//클래스가 메모리에 로딩될 때 생성
	static final String collegeName = "용학원";
	
	//인스턴스 필드, 객체 변수
	//인스턴스 생성시 생성, 객체 소멸시 소멸
	static final int buildYear = 2001;
	static final int day; //오늘 날짜
	static { //static 블럭을 이용해서 초기화
		
		
	//db에서 가져오거나 파일에서 가져오거나 등등..
	Date now = new Date(); //현재날짜 가져오기
	SimpleDateFormat sf = new SimpleDateFormat("dd");
	day = Integer.parseInt(sf.format(now));; 
	}
	//메소드 : 입실 출력
	static void enter(Attendee att) { //지역 변수
		System.out.println(day + "일 " + att.getTitle() + "반 " + att.getName() + " 입실");
	}
	
    //메소드 : 퇴실 출력
	static void exit(Attendee att) {
		System.out.println(day + "일 " + att.getTitle() + "반 " + att.getName() + " 퇴실");
	}
}

public class J20210421_02_Attend {

	public static void main(String[] args) {
		System.out.println(LectureManger.collegeName);
		System.out.println(LectureManger.buildYear + "년 개원");
		
		Attendee ae = new Attendee("A01", "이밤톨", "자바");
		System.out.println(ae);
		
		LectureManger.enter(ae);
		LectureManger.exit(ae);
		
	}

}
