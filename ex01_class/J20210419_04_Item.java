package ex01_class;

//상품 클래스
//필드 itemcode(코드), itemname(품명), price(단가)

class Item{
	//private 접근 제한자 : 클래스 내부에서만 접근 가능
	private String itemcode;
	private String itemname;
	private int price;

//메소드 : 
//1) 판매 금액 계산 : 매개변수(판매 수량), 리턴 값(판매 금액)
	
	int quantity(int qt) {
		return price * qt; 
	}
	//메소드를 이용해서 접근
	//세터(setter)
	//this는 객체 자신
	void setItemcode(String itemcode) {
		this.itemcode = itemcode;
	}
	String getItemcode() {
		return itemcode;
	}
	
	void setItemname(String itemname) {
		this.itemname = itemname;
	}
	String getItemname() {
		return itemname;
	}
	
	void setPrice(int price) {
		this.price = price;
	}
	int getPrice() {
		return price;
	}
	
}



public class J20210419_04_Item {

	public static void main(String[] args) {
		
		Item item = new Item();
		item.setItemcode("8801");
		item.setItemname("사이다"); 
		item.setPrice(1000);
		System.out.println("코드 : " + item.getItemcode());
		System.out.println("이름 : " + item.getItemname());
		System.out.printf("가격 : %,d원\n", item.getPrice());
		System.out.printf("금액 : %,d원\n", item.quantity(5));
		System.out.println("---------------");
//		System.out.println(item.itemname + " 금액 :" + item.amount(5) + "원");
		
		Item item2 = new Item();
		item2.setItemcode("8802");
		item2.setItemname("콜라");
		item2.setPrice(1200);
		System.out.println("코드 : " + item2.getItemcode());
		System.out.println("이름 : " + item2.getItemname());
		System.out.printf("가격 : %,d원\n", item2.getPrice());
		System.out.printf("금액 : %,d원\n", item2.quantity(10));
		System.out.println("---------------");
//		System.out.println(item2.itemname + " 금액 :" + item2.amount(10) + "원");
	}

}
