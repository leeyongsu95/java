//package ex05_collection;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.List;
//import java.util.Map;
//import java.util.Set;
//
////학생 클래스
////필드 : 번호(int no), 이름(String name), 전화번호(Srting tel)
//class Student{
//	private int no;
//	private String name;
//	private String tel;
//	
//	Student(){}
//	public Student(int no, String name, String tel) {
//		this.no = no;
//		this.name = name;
//		this.tel = tel;
//	}
//	public int getNo() {
//		return no;
//	}
//	public void setNo(int no) {
//		this.no = no;
//	}
//	public String getName() {
//		return name;
//	}
//	public void setName(String name) {
//		this.name = name;
//	}
//	public String getTel() {
//		return tel;
//	}
//	public void setTel(String tel) {
//		this.tel = tel;
//	}
//	@Override
//	public String toString() {
//		return "Student [번호 = " + no + ", "
//					  + "이름 = " + name + ", "
//					  + "전화번호 = " + tel + "]";
//	}
//}
//
//public class J20210422_03_Student {
//
//	public static void main(String[] args) {
//		Student st1 = new Student(1, "박종필", "010-7979-1004");
//		Student st2 = new Student(2, "구명선", "010-0129-0832");
//		Student st3 = new Student(3, "이정수", "010-8724-0611");
//		
//		//arraylist에 저장
//		List<Student> st = new ArrayList<>();
//		st.add(st1);
//		st.add(st2);
//		st.add(st3);
//		//System.out.println(st);
//		
//		for(int i = 0; i < st.size(); i++) {
//			//System.out.println(st.get(i));
//			Student s = st.get(i);
//			System.out.println(s.getNo() + " " + s.getName() + " " + s.getTel());
//		}
//		for(Student s : st) {
//			System.out.println(s.getNo() + " " + s.getName() + " " + s.getTel());
//		}
//		
//      //Map에 저장 (Key : no, Value : Student)		
//		Student st1 = new Student(1, "박종필", "010-7979-1004");
//		Student st2 = new Student(2, "구명선", "010-0129-0832");
//		Student st3 = new Student(3, "이정수", "010-8724-0611");
//		
//		Map<Integer, Student> mp = new HashMap<>();
//		
//	    mp.put(st1.getNo(), st1);
//		mp.put(st2.getNo(), st2);
//		mp.put(st3.getNo(), st3);
//		System.out.println(mp);
//		
//		Set<Integer> s = mp.keySet();
//		
//		for(int k : s) {
//			System.out.println(k);
//		}
//		Iterator<Integer> it = s.iterator();
//			
//		while (it.hasNext()) {
//			 int key = it.next();
//			 System.out.println(key);
//			 Student s1 = mp.get(key);
//			 System.out.println(s1.getNo() +" " + s1.getName() +" " + s1.getTel());
//			
//		}
//		//실습) 
//		//result : "success"
//		//data : ArrayList<Student>
//		
//		Student st1 = new Student(1, "박종필", "010-7979-1004");
//		Student st2 = new Student(2, "구명선", "010-0129-0832");
//		Student st3 = new Student(3, "이정수", "010-8724-0611");
//		
//		Map<String, Object> in = new HashMap<>();
//		in.put("result", "success");
//		//System.out.println(in); //test
//		
//		List<Student> s = new ArrayList<>();
//		s.add(st1);
//		s.add(st2);
//		s.add(st3);
//		in.put("data", s);
//		//System.out.println(in); //test
//		
//		
//		//다운캐스팅 부모형을 자식형으로 형변환
//		String result = (String) in.get("result"); 
//		//System.out.println(result); //test
//		
//		if(result.equals("success")) {
//			List<Student> stdlist = (List<Student>) in.get("data");
//			
//			//System.out.println(stdlist); //test
//			
//			for(Student s1 : stdlist) {
//				//System.out.println(s); //test
//				 System.out.println(s1.getNo() 
//						     +" " + s1.getName() 
//						     +" " + s1.getTel());
//			}
//		}else {
//			System.out.println("error");
//		}
//		
//	}
//}
