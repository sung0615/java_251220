package java_251220.ch03.frist;

public class CellPhone {

	//필드
	String model;
	String color;
	
	//생성자
	
	CellPhone(){
		
	}
	
	CellPhone(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	
	
	void powerOn() {
		System.out.println("전원을 컵니다");
	}
	
	
	void powerOff() {
		System.out.println("전원을 끕니다");
	}
	
	
	
	
	
	
	
	
	
}
