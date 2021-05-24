package ex08_inher;

class School{
	void schoolName() {
		System.out.println("국제컴퓨터학교");
	}
	void info(String name) {}; //컴파일 에러를 피하기 위해
}
class Stud extends School{
	@Override
	void info(String name) {
		System.out.println(name +" 학생");
	}
}
class Tech extends School{
	@Override
	void info(String name) {
		System.out.println(name +" 선생님");
	}
}

public class J20210504_01_Student {
	public static void main(String[] args) {
		School s1 =new Stud();
		s1.schoolName();
		//((Stud)s1).info("홍길동");
		s1.info("홍길동");
		
		s1 = new Tech();
		s1.schoolName();
		//((Tech)s1).info("이순신");
		s1.info("이순신");
		
	}

}
