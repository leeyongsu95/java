package ex09_abstract;
//포켓몬:추상클래스
abstract class Pokemon{
//	//일반메소드
//	void gameName() {
//		System.out.println("포켓몬 게임");
//	}
	abstract void attack();
	abstract void sound();
}
//피카츄
class Pikachu extends Pokemon {
	@Override
	void attack() {
		System.out.println("전기공격");
	}

	@Override
	void sound() {
		System.out.println("피카피카");
	}

}
//꼬부기
class Squirtle extends Pokemon{
	@Override
	void attack() {
		System.out.println("물공격");
	}
	@Override
	void sound() {
		System.out.println("꼬북꼬북");
	}
}
//게임
class GamePlay{
	void attackPlay(Pokemon pokemon) {
		pokemon.attack();
	}
	
	void soundPlay(Pokemon pokemon) {
		pokemon.sound();
	}
}

public class J20210504_02_Pokemon {
	public static void main(String[] args) {
		GamePlay play = new GamePlay();
		Pikachu pika = new Pikachu();
		/* pika.gameName(); */
		
		play.attackPlay(pika);
		play.attackPlay(new Squirtle());
		
		play.soundPlay(new Pikachu());
		play.soundPlay(new Squirtle());
	}

}
