package ex01_class;


//은행 class
public class Bank{
	private String bankname;
	private String bankno;
	private int balance;
	
	//생성자 : 오버로딩
	public Bank(String bankname, String bankno) {
		this.bankname = bankname;
		this.bankno = bankno;
	}
	public Bank(String bankname, String bankno, int balance) {
		this.bankname = bankname;
		this.bankno = bankno;
		this.balance = balance;
	}
	public String getBankname() {
		return bankname;
	}
	public void setBankname(String bankname) {
		this.bankname = bankname;
	}
	public String getBankno() {
		return bankno;
	}
	public int getBalance() {
		return balance;
	}
	//어노테이션 : @
	//오버라이딩 : 부모 클래스의 메소드를 재 정의 
	@Override
	public String toString() {
		return "Bank [bankname=" + bankname + ", bankno=" + bankno + ", balance=" + balance + "]";
	}
	//입금 메소드
	void moneyin(int my) {
		
		balance += my;
	}
	
	//출금 메소드
	int moneyout(int my) {
		if(balance - my < 0) {
			System.out.println("잔액 부족");
			return -1; //출금 안됨
		}
			balance -= my;
			return 0; //출금 완료
		}
	}
