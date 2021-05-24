package ex05_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J20210422_02_Map {

	public static void main(String[] args) {
		// 맵 : Key, Value
		// 순서가 없다(index 없다)
		// key 중복 x, value는 중복 o
		
		HashMap<Integer, String> mp = new HashMap<>();
		mp.put(1, "one");
		mp.put(2, "two");
		mp.put(3, "three");
		System.out.println(mp);
		System.out.println(mp.get(2));

		
		//실습) 학생들의 나이(key: 이름, value: 나이)
		
		Map<String, Integer> mm = new HashMap<>();
		mm.put("이씨", 17);
		mm.put("박씨", 18);
		mm.put("김씨", 19);
		System.out.println(mm);
		System.out.println(mm.get("이씨"));
		
	}

}
