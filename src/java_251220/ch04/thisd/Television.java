package java_251220.ch04.thisd;

public class Television implements RemoteControl{

	@Override
	public void turnOn() {
		System.out.println("TV를 컵니다");
		
	}

	@Override
	public void turnOff() {
		System.out.println("TV를 끕니다");
		
	}

	@Override
	public void setVolume() {
		// TODO Auto-generated method stub
		
	}

}
