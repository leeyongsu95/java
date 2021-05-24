package java01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class J20210413_01_if {

	public static void main(String[] args) {
		//조건문 : if
		//두 수를 입력 받아 큰 수를 출력.
//		Scanner sc = new Scanner(System.in); //입력 받기 위한 메소드
//		System.out.print("두수는?");
//		int score1 = sc.nextInt();
//		int score2 = sc.nextInt();
//		
//		if(score1 > score2) {
//			System.out.println(score1);
//			System.out.println("첫번째 수가 더 큽니다.");
//		} else if (score1 < score2) {
//			System.out.println(score2);
//			System.out.println("두번째 수가 더 큽니다.");
//		} else {
//			System.out.println("두수는 같다.");
//		}
		
		//실습) 조건문
		//점수를 입력 받고 입력 받은 점수에 따라 등급을 출력하시오.
		//예 점수는? 85 B등급 입니다.
		//단) 90점 이상 A, 80점 이상 B, 70점 이상 C, 60점 이상 D, 60점 미만 F
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("점수는?");
//		int score = sc.nextInt();
//		
//		if(score >= 90) {
//			System.out.println("A등급 입니다.");
//		}else if(score >= 80){
//			System.out.println("B등급 입니다.");
//		}else if(score >= 70){
//			System.out.println("C등급 입니다.");
//		}else if(score >= 60){
//			System.out.println("D등급 입니다.");
//		} else {
//			System.out.println("F등급 입니다.");
//		}
//		
//		//실습) 조건문
//		//등수와 전체 인원수를 입력 받아상대 평가 
//		//상위 15%는 A학점, 상위 35%는 B학점, 상위 50%는 C학점
//		//예) 전체 인원 수? 90명, 등수는? 20등 = B학점 입니다.
//		
//		int tot, grade;
//		
//		Scanner sc  =new Scanner(System.in);
//		System.out.print("전체인원수?");
//		tot = sc.nextInt();
//		System.out.print("등수?");
//		grade = sc.nextInt();
//		
//		if (grade <= tot*0.15)
//			System.out.println("A등급");
//		else if (grade < tot*0.35)
//			System.out.println("B등급");
//		else if (grade < tot*0.50)
//			System.out.println("C등급");
//		else
//			System.out.println("F등급");
//		
//		
//		
//		//실습) 화씨(F) <=> 섭씨(C)로 바꾸기
//		//공식 : (1)화씨 온도를 섭씨 온도로
//		// 			섭씨 온도 = (화씨 온도 - 32) x 5/9
//		//	    (2)섭씨 온도를 화씨 온도로
//		// 			화씨 온도 = (섭씨 온도 x 9/5) + 32
//		//온도 : 10C 또는 100 F
//
//		Scanner sc = new Scanner(System.in);
//		System.out.print("온도는?");
//		int t = sc.nextInt();
//		String s = sc.next();
//		System.out.println(t + s);
//			
//		//문자열 비교시 equals 메소드를 이용하여 비교
//		
//		if(s.equals("C")) { //섭씨 온도라면
//			System.out.println("화씨 온도: " + (t * (double) 9 / 5 + 32));
//			
//		}else if (s.equals("F")) { //화씨 온도라면
//			System.out.println("섭씨 온도: " + ((t - 32) * (double) 5 / 9));
//			
//		} else { //그외
//			System.out.println("잘못된 온도 ");
//	
//		}
//		
//		
//		//실습) 계산기
//		//방법 1)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계산식 입력하세요: ");
//		try {
//			int a = sc.nextInt();
//			String sign = sc.next();
//			int b = sc.nextInt();
//	//			System.out.println(a + sign + b); //출력 테스트
//			
//			if(sign.equals("+")) {
//				System.out.println("= " + (a + b));
//				
//			}else if (sign.equals("-")) {
//				System.out.println("= " + (a - b));
//				
//			}else if (sign.equals("*")) {
//				System.out.println("= " + (a * b));
//				
//			}else if (sign.equals("/")) {
//				System.out.println("= " + ((double)a / b));
//			}
//		}catch(InputMismatchException e) {
//			System.out.println("숫자를 입력해 주세요.");
//		}
//		
//		
//		
//		//방법 2)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("계산식 입력하세요: ");
//		int a = sc.nextInt();
//		String sign = sc.next();
//		int b = sc.nextInt();
////		System.out.println(a + sign + b); //출력 테스트
//		
//		if(sign.equals("+")) {
//			System.out.println("= " + (a + b));
//			
//		}else if (sign.equals("-")) {
//			System.out.println("= " + (a - b));
//			
//		}else if (sign.equals("*")) {
//			System.out.println("= " + (a * b));
//			
//		}else if (sign.equals("/")) {
//			System.out.println("= " + ((double)a / b));
//		}
//		
//		//방법 3)
//		Scanner sc = new Scanner(System.in);
//		System.out.print("숫자 값은?: ");
////		System.out.println("숫자? "+ sc.hasNextInt());
		
//		//코드 인 스펙션(규율) : == 로 true, false 비교 하지 않는다.
//		if(!sc.hasNextInt()) { //숫자가 아니라면
//			System.out.println("숫자가 아닙니다.");
//		} else {
//			int a = sc.nextInt();
//			System.out.println("숫자 값: " + a);
//		}
//		
//		//실습) 중첩 조건문
//		//아이디와 패스워드를 입력 받아 로그인 성공여부를 결정 짓는 프로그램 구현.
//		//예) 아이디를 입력해 주세요: java -> 아이디가 일치합니다.
//		//패스워드를 입력해 주세요: 1234 -> 패스워드가 일치합니다.
//		//로그인 성공!
//		
//		String myid = "java";
//		String mypw = "1111";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("아이디는? : ");
//		String id = sc.next();
//		
//		
//		if(id.equals(myid)){
//			System.out.print("비밀번호는? : ");
//			String pw = sc.next();
//			if(pw.equals(mypw)) 
//				System.out.println("로그인 성공!");
//			else 
//				System.out.println("비밀번호 불일치");
//			
//		}else 
//			System.out.println("아이디가 불일치");
//		
//		
//		
//		//실습) 년을 입력 받고 윤년 체크하기
//		//윤년의 조건
//		//1) 4의 배수이면 윤년
//		//2) 그러나 100의 배수이면 윤년이 아니다.
//		//3) 400년의 배수이면 윤년
//		
//		//방법 1)
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("년도는? : ");
//		int year = sc.nextInt();
//		System.out.println("년도는 --> " + year);
//		
//		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
//			System.out.println(year + "은 윤년 입니다.");
//		}else{
//			System.out.println(year + "은 윤년이 아닙니다.");
//		}
//		
//		//방법 2)
//		int year = 400;
//		
//		if(year % 4 ==0) {
//			if(year % 100 == 0)
//				if(year % 400 == 0)
//					System.out.println(year + "은 윤년 입니다.");
//			else
//				System.out.println(year + "은 윤년이 아닙니다.");
//		}else {
//			System.out.println(year + "은 윤년이 아닙니다.");
//		}
//		if(year % 4 == 0 && year % 4!=100) {
//			
//		}
//		
//		//실습) 전기 사용 요금 계산
//		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("사용량을 입력하세요.");
//		String wh = sc.next();
//		
//		double won;
//		int use = 401; 	//사용량
//		double eleUse1 = 88.3;  //1단계 전력량 요금
//		double eleUse2 = 182.9; //2단계 전력량 요금
//		double eleUse3 = 275.6; //3단계 전력량 요금
//		int base; 		//기본요금
//		
//		if (use <= 200) { // 1단계
//			base = 910;
//			won = base + use * eleUse1; 
//		
//		}else if(use <= 400) { // 2단계
//			base = 1600;
//			won = base + (200 * eleUse1) + ((use - 200) * eleUse2); 
//		
//		}else { // 3단계
//			base = 7300;
//			won = base + (200 * eleUse1) + (200 * eleUse2 + ((use - 400) * eleUse3));
//		}
//		System.out.println("이번달 전기요금 : " + won + "원");
//		System.out.println("이번달 전기요금 : " + Math.floor(won) + "원"); //소숫점 버림
//		System.out.println("이번달 전기요금 : " + Math.ceil(won) + "원");  //소숫점 올림
//		System.out.println("이번달 전기요금 : " + Math.round(won) + "원");  //소숫점 반올림
//		
//		
//		System.out.println("이번달 전기요금 : " + (int)won + "원");
		
		//무작위의 수 추출
		//0 <= 랜덤값 < 1
		//r * (end-start+1)+start
//		double r = Math.random();
//		System.out.println(r);
//		System.out.println((int)(r * (6 - 1 + 1) + 1)); //1 ~ 6
//		System.out.println((int)(r * (10 - 5 + 1) + 5)); //5 ~ 10
//		System.out.println((int)(r * (20 - 11 + 1) + 11)); //11 ~ 20
//		
//		//주사위 게임
//		int a = (int)(Math.random() * 6 + 1);	
//		int b = (int)(Math.random() * 6 + 1);
//		System.out.println("=================");
//		System.out.println("A 주사위 값: " + a);
//		System.out.println("B 주사위 값: " + b);
//		System.out.println("=================");
//		
//		if(a > b) {
//			System.out.println("A승!");
//		}else if(b > a) {
//			System.out.println("B승!");
//		}else {
//			System.out.println("무승부!");
//		}
		
		
		
	}
}


