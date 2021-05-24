package ex13_thread;

public class J20210507_03_sleep {
	public static void main(String[] args) throws InterruptedException {
		Thread th = new Thread(new Runnable() {
			
			@Override
			public void run() {
				try {
					for(int i = 5; i > 0; i--) {
						//우선 순위가 낮은 스레드가 기아상태에 빠지는 것을 방지
						System.out.println(i + "초");
						Thread.sleep(1000);
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		});
		th.start();
		
		System.out.println("메인 스레드 종료");
	}

}
