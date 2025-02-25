package java_251220.ch07.frist;

import java.awt.Toolkit;

public class TryCatchFinalEx {

	public static void main(String[] args) throws InterruptedException {
		
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			
			toolkit.beep();	
			Thread.sleep(500);
			
			
			
		}
	

	}
	
	public void abc() throws Exception {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			
			toolkit.beep();	
			Thread.sleep(500);
		}
	}
	
	public void xyz() throws Exception {
		abc();
	}
	

}
