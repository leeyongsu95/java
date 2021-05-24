package ex13_thread;
//스레드만들기 2
//class MyRunn implements Runnable{
//
//	@Override
//	public void run() {
//		for(int i=0; i< 10; i++) {
//			System.out.println("runnable 스레드" + i);
//		}
//	}
//	
//}

public class J20210507_02_Runnable {

	public static void main(String[] args) {
//		MyRunn myRun = new MyRunn(); //실행 구현
//		Thread th = new Thread(myRun); //쓰레드 생성
//		th.start(); //쓰레드 시작
		
		//익명 클래스: Runnable을 상속
//		Runnable myRun = new Runnable() {
//			@Override
//			public void run() {
//				for(int i=0; i< 10; i++) {
//					System.out.println("runnable 스레드" + i);
//				}
//			}
//		};
//		Thread th = new Thread(myRun); //쓰레드 생성
//		th.start();
		
		//스레드 우선순위 : 1~10 (클수록 높음)
		//스레드1 생성
		Thread th1 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i< 10; i++) {
					System.out.println("스레드1 : " + i);
				}
			}
		});
		th1.setPriority(1); //우선순위 가장 낮다
		th1.start();
		
		Thread th2 = new Thread(new Runnable() {
			@Override
			public void run() {
				for(int i=0; i< 10; i++) {
					System.out.println("스레드2 : " + i);
				}
			}
		});
		th2.setPriority(10); //우선순위 가장 높다
		th2.start();
		
		//main스레드에서 동작
		for(int i=0; i< 10; i++) {
			System.out.println("main 스레드" + i);
		}
		

	}

}
