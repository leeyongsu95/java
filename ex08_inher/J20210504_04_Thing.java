package ex08_inher;

import java.util.HashMap;
import java.util.Map;

class Thing {
}
class Pen extends Thing{
	public String toString() {
		return "펜";
	}
}

class Note extends Thing{
	public String toString() {
		return "노트";
	}
}
//입고클래스
class Enter{
	//재고 저장 맵
	Map<String,Integer> enMap = new HashMap<>();
	//입고메소드
	void enterPrint(Thing th, int qty) {
		System.out.println(th.toString() + qty + " 입고");
		Integer stockQty = enMap.get(th.toString()); //기존 재고 조회
		if (stockQty==null) stockQty = 0; //재고가 없을경우 초기화
		enMap.put(th.toString(), stockQty + qty); //재고 누적
	}
	//재고 출력 메소드
	void stockPrint(Thing th) {
		System.out.println(enMap);
		System.out.println(th.toString() +" 현재재고 : " + enMap.get(th.toString()) + "개"); 
	}
}

public class J20210504_04_Thing {

	public static void main(String[] args) {
		Enter enter = new Enter();
		Pen pn = new Pen();
		enter.enterPrint(pn, 10);
		enter.enterPrint(pn, 50);
		enter.stockPrint(pn);
		
		Note ne = new Note();
		enter.enterPrint(ne, 21);
		enter.enterPrint(ne, 49);
		enter.stockPrint(ne);
		
		
	}

}
