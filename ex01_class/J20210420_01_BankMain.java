package ex01_class;

import java.util.Scanner;

public class J20210420_01_BankMain {
	public static void main(String[] args) {
		//하나의 계좌만 등록 가능
		Scanner sc = new Scanner(System.in);
		//Bank[] banks = new Bank[3];  
		Bank b1 = null;
		while (true) {
			System.out.println("----------------");
			System.out.println("---국제은행----- ");
			System.out.println("----------------");
			System.out.println("1.계좌개설");
			System.out.println("2.입금");
			System.out.println("3.출금");
			System.out.println("4.잔액조회");
			System.out.println("9.종료");
			System.out.println("----------------");
			System.out.print("선택?");
			int no = sc.nextInt();
			sc.nextLine(); //버퍼비우기
			switch (no) {
			case 1: //개좌개설
				System.out.print("통장이름?");
				String bankname = sc.nextLine();
				System.out.print("계좌번호?");
				String bankno = sc.next();
				b1 = new Bank(bankname, bankno);
				break;
			case 2: //입금
				if (b1 == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("입금할 금액은?");
				int inputMoney = sc.nextInt();
				b1.moneyin(inputMoney);
				break;
			case 3: //출금
				if (b1 == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("출금할 금액은?");
				int outputMoney = sc.nextInt();
				int result = b1.moneyout(outputMoney);
				if (result == 0)
					System.out.println("출금 완료");
				else 
					System.out.println("잔액부족");
				System.out.println("잔액:" + b1.getBalance());
				
				break;		
			case 4: //잔액조회
				System.out.println("잔액:" + b1.getBalance());
			case 9: //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			default :
				System.out.println("잘못된 선택");
			}
			
		}
		
//		Bank b1 = new Bank("청약저축", "110-88-99");
//		System.out.println("계좌이름:" + b1.getBankname());	
//		System.out.println("계좌번호:" + b1.getBankno());
//		System.out.println("잔액:" + b1.getBalance());
//		b1.input(1000);
//		System.out.println("잔액:" + b1.getBalance());
//		b1.output(500);
//		System.out.println("잔액:" + b1.getBalance());
//		
//		System.out.println("------------------------");
//		Bank b2 = new Bank("청약저축", "999-99-99", 10000);
//		b2.setBankname("디딤돌저축");
//		System.out.println("계좌이름:" + b2.getBankname());	
//		System.out.println("계좌번호:" + b2.getBankno());
//		System.out.println("잔액:" + b2.getBalance());
//		System.out.println(b2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
