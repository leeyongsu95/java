package ex12_inner;

interface Item{
	void namePrint(String itemname);
}
class ItemImpl implements Item{

	@Override
	public void namePrint(String itemname) {
		System.out.println(itemname);
		
	}
}


public class J20210507_04_item {

	public static void main(String[] args) {
		ItemImpl il = new ItemImpl();
		il.namePrint("새우깡");

		//item 인터페이스를 상속 받는 객체 생
		Item im = new Item() {
			@Override
			public void namePrint(String itemname) {
				System.out.println(itemname);
			}
		};
		im.namePrint("익명 클래스 새우깡");
	}

}
