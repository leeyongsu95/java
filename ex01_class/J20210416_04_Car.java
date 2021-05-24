package ex01_class;

//자동차 클래스
//속성: name, color, power, speed
//기능: powerToggle, speedUp, speeDown

class Car {
	
	String name = "volvo_XC90";
	String color = "black";
	boolean power;
	int speed;
	
	void powerToggle() { //파워 토글
		power = !power;
	}
	void speedUp() {   //속력 up : 100km 초과 불가
		if(speed < 100)
			speed++;
	}
	void speedDown() { //속력 down : 50km 미만 불가
		if(speed > 50)
			speed--;
	}
}
public class J20210416_04_Car {
	public static void main(String[] args) {
		Car c1 = new Car();
		System.out.println("파워:" + c1.power);
		
		System.out.println("속력:" + c1.speed);
		c1.powerToggle();
		System.out.println("파워:" + c1.power);
		System.out.println("----------------------");
		for(int i = 0; i < 100; i++) {
			c1.speedUp();
		}
		System.out.println("속력 Up : " + c1.speed + "km 주행");
		System.out.println("----------------------");
		for(int i = 0; i < 100; i++) {
			c1.speedDown();
		}
		System.out.println("속력 Down : " + c1.speed + "km 주행");
		System.out.println("----------------------");
	}

}
