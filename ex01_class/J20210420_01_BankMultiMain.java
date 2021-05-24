package ex01_class;

import java.util.Scanner;

public class J20210420_01_BankMultiMain {
	public static void main(String[] args) {
		//여러개의 계좌 등록 가능
		Scanner sc = new Scanner(System.in);
		Bank[] banks = new Bank[3];  //Bank 객체의 주소를 저장할수있는 공간 3개
		int custno = 0;
		while (true) {
			System.out.println("----------------");
			System.out.println("---국제은행----- ");
			System.out.println("---고객번호:" + custno);
			System.out.println("----------------");
			System.out.println("0.고객번호로그인");
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
			case 0:
				System.out.print("고객번호는?");
				custno = sc.nextInt();
				break;
			case 1: //개좌개설
				System.out.print("통장이름?");
				String bankname = sc.nextLine();
				System.out.print("계좌번호?");
				String bankno = sc.next();
				banks[custno-1] = new Bank(bankname, bankno);
				break;
			case 2: //입금
				if (banks[custno-1] == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("입금할 금액은?");
				int inputMoney = sc.nextInt();
				banks[custno-1].moneyin(inputMoney);
				break;
			case 3: //출금
				if (banks[custno-1] == null) {
					System.out.println("계좌를 먼저 개설하세요");
					continue;
				}
				System.out.print("출금할 금액은?");
				int outputMoney = sc.nextInt();
				int result = banks[custno-1].moneyout(outputMoney);
				if (result == 0)
					System.out.println("출금 완료");
				else 
					System.out.println("잔액부족");
				System.out.println("잔액:" + banks[custno-1].getBalance());
				
				break;		
			case 4: //잔액조회
				System.out.println("잔액:" + banks[custno-1].getBalance());
				break;
			case 9: //종료
				System.out.println("프로그램을 종료합니다");
				System.exit(0);
			default :
				System.out.println("잘못된 선택");
			}
			
		}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
