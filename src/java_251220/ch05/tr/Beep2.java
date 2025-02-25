package java_251220.ch05.tr;

import java.awt.Toolkit;

public class Beep2 implements Beep{

	@Override
	public void aa() {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		for (int i = 0; i < 5; i++) {
			System.out.println("12");
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}
		
	}

}
