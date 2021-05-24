package ex01_class;

import java.util.Arrays;

//학생 클래스
//필드 : 반, 이름, 점수(JAVA, Python, C)
//메소드 : 점수의 합계, 평균을 계산해서 반환

class Student{
	
	String gruop = "2021";  //반
	String name  = "이용수";  //이름
	int[] score  = new int[3];   //점수
	int sum;       //합계
	
	//합계 구하기
	//method의 overloading
	//call_by_value
	void sumCal(int a, int b, int c) { //합계
		sum = 0;
		score[0] = a; score[1] = b;	score[2] = c;
		sum = a + b + c;
	}
	
	//call_by_reference
	void sumCal(int[] score) {        //합계
		sum = 0;
		this.score = score; //얕은 복사 
		for(int i = 0; i < score.length; i++) {
			sum += score[i];
		}
	}
	double avgCal() {
		double avg = (double)sum / score.length;
		return (double)Math.round(avg * 100) / 100;
	}
	
	
}


public class J20210419_03_Student {

	public static void main(String[] args) {
		Student st = new Student();
		
		System.out.println(" 반  : " + st.gruop);
		System.out.println("이름 : " + st.name);
		System.out.println("--------------");
		
		st.sumCal(69, 79, 89);
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계 : " + st.sum + "점");
		System.out.println("--------------");
		
		st.sumCal(new int[] {89, 90, 99});
		System.out.println(Arrays.toString(st.score));
		System.out.println("합계 : " + st.sum + "점");
		System.out.println("--------------");
		
		System.out.println("평균 : " + st.avgCal() + "점");
	}

}
