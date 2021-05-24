package java01;

import java.util.Scanner;

public class J20210416_studyproject {

	public static void main(String[] args) {
		//실습 2명 학생의 국, 영, 수 점수를 입력 받아 배열에
		//저장하고 각자의 합계와 평균을 구하는 프로그램 구현.

		
		
		Scanner sc = new Scanner(System.in);
		
		int[][] score = new int[2][3];
		String[] sub = {"국어", "영어", "수학"};
		//타이틀
		
		while (true) {
			System.out.println("------------------------------");
			System.out.println("국제 성적 관리 프로그램 V1.0.0");
			System.out.println("------------------------------");
			System.out.println("1. 성적 등록");
			System.out.println("2. 학생별 합계 / 평균");
			System.out.println("3. 과목별 합계 / 평균");
			System.out.println("4. 종료");
			System.out.println("------------------------------");
			System.out.print("검색할 번호? : ");
			int no = sc.nextInt();
			//스위치문 방법
			switch(no) {
			case 1 :
				//점수 입력 받기\
				System.out.println("------점수 출력------");
				for(int i = 0; i < score.length; i++) {
						System.out.printf("[%d번 학생]\n", i +1);
					for(int j = 0; j < score[i].length; j++) {
						System.out.printf("%s 점수 : ", sub[j]);
						score[i][j] = sc.nextInt();
					}
				}
			case 2 :
				//학생별 합계, 평균
				System.out.println("-----학생별 출력-----");
				for(int i = 0; i < score.length; i++) {
					int sum = 0;
					for(int j = 0; j < score[i].length; j++) {
						sum += score[i][j];
					}
					//합계
					System.out.println("---------------------");
					System.out.printf("[%d번 학생] 합계: %d\n", i + 1, sum);
					System.out.printf("[%d번 학생] 평균: %.2f\n", i + 1, (double)sum/score[i].length);	
				}
			case 3 :
				//국, 영, 수 평균
				System.out.println("-----과목별 출력-----");
				for(int j = 0; j < 3; j++) {
					int sum = 0;
					
					for(int i = 0; i < 2; i++) {
						sum += score[i][j];
						System.out.println("점수 : " + score[i][j]);
					}
					System.out.println(sub[j] + " 합계 : " + sum);
					System.out.println(sub[j] + " 평균 : " + (double)sum/score.length);
					System.out.println("---------------------");
				}
			case 4 :
				System.out.println("------------------------------");
				System.out.println("프로그램 종료.");
				System.exit(0); //프로그램 정상 종료
			default:
				System.out.println("잘못된 번호");
			}
			sc.nextLine(); //버퍼 비우기
			System.out.println("엔터를 누르세요");
			sc.nextLine(); //홀딩
		}
//		
//		
//		
//		
//		if문 방법
//		Scanner sc = new Scanner(System.in);
//		
//		int[][] score = new int[2][3];
//		String[] sub = {"국어", "영어", "수학"};
//		//타이틀
//		while (true) {
//			
//		System.out.println("------------------------------");
//		System.out.println("국제 성적 관리 프로그램 V1.0.0");
//		System.out.println("------------------------------");
//		System.out.println("1. 성적 등록");
//		System.out.println("2. 학생별 합계 / 평균");
//		System.out.println("3. 과목별 합계 / 평균");
//		System.out.println("4. 종료");
//		System.out.println("------------------------------");
//		System.out.print("검색할 번호? : ");
//		int no = sc.nextInt();
		
//		if(no == 1) {
//			//점수 입력 받기\
//			System.out.println("------점수 출력------");
//			for(int i = 0; i < score.length; i++) {
//					System.out.printf("[%d번 학생]\n", i +1);
//				for(int j = 0; j < score[i].length; j++) {
//					System.out.printf("%s 점수 : ", sub[j]);
//					score[i][j] = sc.nextInt();
//				}
//			}
//			
//		}else if(no == 2) {
//			//학생별 합계, 평균
//			System.out.println("-----학생별 출력-----");
//			for(int i = 0; i < score.length; i++) {
//				int sum = 0;
//				for(int j = 0; j < score[i].length; j++) {
//					sum += score[i][j];
//				}
//				//합계
//				System.out.println("---------------------");
//				System.out.printf("[%d번 학생] 합계: %d\n", i + 1, sum);
//				System.out.printf("[%d번 학생] 평균: %.2f\n", i + 1, (double)sum/score[i].length);	
//			}
//			
//		}else if(no == 3) {
//			//국, 영, 수 평균
//			System.out.println("-----과목별 출력-----");
//			for(int j = 0; j < 3; j++) {
//				int sum = 0;
//				
//				for(int i = 0; i < 2; i++) {
//					sum += score[i][j];
//					System.out.println("점수 : " + score[i][j]);
//				}
//				System.out.println(sub[j] + " 합계 : " + sum);
//				System.out.println(sub[j] + " 평균 : " + (double)sum/score.length);
//				System.out.println("---------------------");
//			}
//		}else if(no == 4) {
//			System.out.println("------------------------------");
//			System.out.println("프로그램 종료.");
//			break;
//		}else {
//			System.out.println("잘못된 번호");
//		}
//		}
//		}
	}
}
