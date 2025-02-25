package java_251220.ch06.frist;

public class BoxEx {

	public static void main(String[] args) {
	
		
//		Box box = new Box();
//		
//		box.a = 1;		
//		System.out.println(box.a);
		
		
		// 둘중 하나선택
		Box<Integer> box = new Box<>();
//		Box<Integer> box = new Box<Integer>();
		
		box.setT(1);
		
		System.out.println(box.getT());
		
		
		
//		Box<int> box2= new Box<>(); 원시타입은 에러
		
		Box<String> box3 = new Box<>();
		box3.setT("ㅗHI");
		System.out.println(box3.getT());
		
		
		
		
		
		
	}

}
