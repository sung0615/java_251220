package java_251220.ch05.frist;

import java.awt.Toolkit;

public class BeepEx {

	public static void main(String[] args) {
			//Crel + Shift + O import 단축기
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		
		
		for (int i = 0; i <5; i++) {
			toolkit.beep();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		
		for (int i = 0; i <5; i++) {
			System.out.println("12");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
		}
		// 번갈아가면서
		for (int i = 0; i <5; i++) {
			System.out.println("12");
			toolkit.beep();
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		
		
	}

}
