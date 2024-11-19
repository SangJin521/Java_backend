package ThreadEx3;

import java.awt.Toolkit;

public class BeepPrintMain {

	public static void main(String[] args) {
		
		Thread thread = new Thread(new Runnable() {

			@Override
			public void run() {
				Toolkit toolkit = new Toolkit.getDefaultToolkit();
				
				for (int i=0; i<5; i++) {
					toolkit.beep();
					try {
						Thread.sleep(500);
					} catch (Exception e) {
						
					}
				}
			}
			
		});
		
		thread.start();
		
		for (int i=0; i<5; i++) {
			System.out.println("땡");
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				
			}
		}

	}

}
