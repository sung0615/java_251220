package java_251220.ch08.second;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

	public static void main(String[] args) {
	
		Set<String> computerLangs = new HashSet<>();
		
		computerLangs.add("HTML");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("CSS");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		computerLangs.add("JAVA");
		computerLangs.add("Javascript");
		computerLangs.add("Bootstrap");
		
		
		for (String computerLang: computerLangs) {
			System.err.println("computerLang: "+  computerLang);
		}
		
		
		
		
		
		
	}

}
