package ex04_generics;

//일반 멤버 클래스
//필드 : 아이디(userid), 비밀번호(passwd)

class Member{
	private String userid;
	private String passwd;
	
	
	public Member() {}
	public Member(String userid, String passwd) {
		this.userid = userid;
		this.passwd = passwd;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	
	@Override
	public String toString() {
		return "Member [아이디 = " + userid + ","
				    + " 비밀번호 = " + passwd + "]";
	}
}

//중요 회원
//필드 : 아이디(userid), 비밀번호(passwd), 할인율(rate)
class Vip{
	private String userid;
	private String passwd;
	private double rate;
	
	public Vip() {}
	public Vip(String userid, String passwd, double rate) {
		this.userid = userid;
		this.passwd = passwd;
		this.rate = rate;
	}

	public String getUserid() {
		return userid;
	}
	public void setUserid(String userid) {
		this.userid = userid;
	}
	public String getPasswd() {
		return passwd;
	}
	public void setPasswd(String passwd) {
		this.passwd = passwd;
	}
	public double getRate() {
		return rate;
	}
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	@Override
	public String toString() {
		return "Vip [아이디 = " + userid + ", "
				+ "비밀번호 = " + passwd + ", "
				+ "할인율 = " + rate + "]";
	}	
}

//로그인 관리 클래스
class LoginManger<T>{
	
	//로그인 메소드
	void Memberlogin(T member) {
		System.out.println(member);
		if(member instanceof Member) {
			System.out.println(((Member) member).getUserid() + "님 로그인");
		}else if(member instanceof Vip) {
			System.out.println(((Vip) member).getUserid() + "님 로그인");
		}
		
	}
}

public class J20210422_02_Member {

	public static void main(String[] args) {
		Member mr = new Member("asd1004", "1004");
		//System.out.println(mr);
		
		Vip vp = new Vip("vip1", "7979", 0.2);
		//System.out.println(vp);
		
		
		//로그인
		LoginManger<Member> lr = new LoginManger<>();
		lr.Memberlogin(mr);
		
		LoginManger<Vip> lrvp = new LoginManger<>();
		lrvp.Memberlogin(vp);
	}

}
