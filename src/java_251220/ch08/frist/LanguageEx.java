package java_251220.ch08.frist;

import java.util.ArrayList;
import java.util.List;

public class LanguageEx {
	
	public static void main(String[] args) {
		
		// 둘중 하나 쓰면 된다
//		ArrayList<String>friends = new ArrayList<String>();
		List<String> friends = new ArrayList<>();
		
		System.out.println("test.size(): " + friends.size());
		
		friends.add("성태");
		friends.add("지현");
		friends.add("이유");
		friends.add("Tom");
		friends.add("Tony");
		friends.add("Selly");
		
		System.out.println("test.size(): " + friends.size());
		
		for (int i = 0; i < friends.size(); i++) {
			System.out.println("test.get(i) : " + friends.get(i));
		}
		
		
		//향성된 for 문
		for (String friend: friends) {
			System.out.println("friend : " + friend);
		}
		
		
		
		
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		test.remove(0);
//		
//		
//		System.out.println("test.size(): " + test.size());
		
	}

}
