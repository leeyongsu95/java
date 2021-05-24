package ex10_interface;
//클래스는 다중상속 불가
//인터페이스: 구현부가 없다, 다중 상속 가능, 객체 생성 불가
interface Attack{
	String name = "포켓몬 공격"; // public static final 생략가능
	void attack(); //public abstract 생략가능
	
	//default : 일반 메소드
	default void gameTime() {
		System.out.println("24시간 공격 가능");
	}
}

interface Sound{
	String name = "포켓몬 소리";
	abstract void sound();
}
//피카
class Pikachu implements Attack,Sound{
	@Override
	public void attack() {
		System.out.println("백만 볼트!");
	}

	@Override
	public void sound() {
		System.out.println("피까피까");
	}
}

class Squirtle implements Attack ,Sound{
	@Override
	public void attack() {
		System.out.println("물 대포!");
	}

	@Override
	public void sound() {
		System.out.println("꼬북꼬북");
	}
}
//게임
class GamePlay{
	void attack(Attack attack) {
		attack.attack();
	}
	void sound(Sound sound) {
		sound.sound();
	}
}



public class J20210504_01_Interface {
	public static void main(String[] args) {
		 Pikachu pu = new Pikachu(); 
		/* pu.attack(); pu.sound(); */
		/* Attack attack = new Pikachu(); */
		 Sound sound = new Pikachu(); 
		/* attack.attack(); */
		/* sound.sound(); */
		
		 Squirtle se = new Squirtle(); 
		/* se.attack(); se.sound(); */
		System.out.println(Attack.name);
		System.out.println("-----------");
		GamePlay gy = new GamePlay();
		pu.gameTime();
		gy.attack(pu);
		gy.sound(pu);
		System.out.println("-----------");
		gy.attack(se);
		gy.sound(se);

	}

}

