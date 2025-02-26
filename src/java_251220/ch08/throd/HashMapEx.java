package java_251220.ch08.throd;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

	public static void main(String[] args) {
		
		Map<String, Integer> friends = new HashMap<>();
		
		friends.put("배성태 키", 174);
		friends.put("장동건 키", 180);
		friends.put("아이유 키", 165);
		friends.put("고소영 키", 167);
		friends.put("최은영 키", 172);
	
		//키 값으로 지운다
//		friends.remove("최은영 키");
		
		for (String strKey: friends.keySet()) {
			Integer strValue = friends.get(strKey);
			System.out.println(strKey + "strValue: " + strValue);
		}
		
		for (String aa: friends.keySet()) {
			
			Integer bb = friends.get(aa);
			System.out.println(aa + ":" + bb);
		}
		

	}

}
