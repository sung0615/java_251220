package java_251220.ch05.frist;

import java.awt.Toolkit;

public class BeepPrintRunnable implements Runnable{

	@Override
	public void run() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		for(int i = 0; i < 5; i++) {
			toolkit.beep();
			try { Thread.sleep(500); } catch (Exception e) {
				
			}
		}
		
	}

}
