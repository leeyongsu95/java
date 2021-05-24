package ex01_class;

import java.util.Arrays;

//책 클래스
//필드: 책코드(String), 책명(String), 단가(int), 할인율(double) 
//생성자, 게터,세터, toString
//메소드:판매금액계산(매개변수:수량(int), 반환값:판매금액(int))
class Book{
	private String bookCode;
	private String bookName;
	private int price;
	private double discountRate;
	public Book() {
		super();
	}
	public Book(String bookCode, String bookName, int price, double discountRate) {
		super();
		this.bookCode = bookCode;
		this.bookName = bookName;
		this.price = price;
		this.discountRate = discountRate;
	}
	public String getBookCode() {
		return bookCode;
	}
	public void setBookCode(String bookCode) {
		this.bookCode = bookCode;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public double getDiscountRate() {
		return discountRate;
	}
	public void setDiscountRate(double discountRate) {
		this.discountRate = discountRate;
	}
	@Override
	public String toString() {
		return "Book [책 코드 = " + bookCode + ", 책 이름 = " + bookName + ", "
				+ "가격 = " + price + 
				", 할인율 = " + discountRate + "]";
	}

}

//책 관리 클래스
class Manger{
	//판매 금액 합계
	//074 : 0 
	//075 : 1
	
	private int[] tot = new int[10];
	
	int[] getTot() {
		return tot;
	}
	
	//판매 금액 계산
	int saleCal(Book book, int qty, int index) {
		//test
		//System.out.println(book);
		//System.out.println(qty);
		String bookcode = book.getBookCode();
		int price = book.getPrice();
		double discountRate = book.getDiscountRate();
		int totPrice = (int) (price - price * discountRate) * qty;
		tot[index] += totPrice;  //합계 누적
		
		
		return totPrice;
	}
}
public class J20210421_01_Book {

	public static void main(String[] args) {
		Book[] barr = new Book[10];
		barr[0] = new Book();
		
		
		barr[0].setBookCode("074");
		barr[0].setBookName("이것이 자바다");
		barr[0].setPrice(13000);
		barr[0].setDiscountRate(0.3);
		//toString test
		//System.out.println(bk);
		
		barr[1] = new Book("075", "python good", 11000, 0.25);
		Manger mg = new Manger();
		
		
		System.out.println("코 드 : " + barr[0].getBookCode());
		System.out.println("이 름 : " + barr[0].getBookName());
		System.out.printf("가 격 : %,d원\n", mg.saleCal(barr[0], 3, 0));
		System.out.println("----------------------");
		
		System.out.println("코 드 : " + barr[1].getBookCode());
		System.out.println("이 름 : " + barr[1].getBookName());
		System.out.printf("가 격 : %,d원\n", mg.saleCal(barr[1], 6, 1));
		System.out.println("----------------------");

		System.out.println(Arrays.toString(mg.getTot()));
	}

}
