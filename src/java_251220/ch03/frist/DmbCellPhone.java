package java_251220.ch03.frist;

public class DmbCellPhone extends CellPhone{

	DmbCellPhone(){
		
	}
	
	DmbCellPhone(String model, String color){
	super(model, color);
		
	}

	@Override
	void powerOn() {
		System.out.println("DmbCellPhone.전원을 컵니다");
	}

	@Override
	void powerOff() {
		System.out.println("DmbCellPhone.전원을 끕니다");
	}
	
	
	
	
	
	
	
	
	
}
