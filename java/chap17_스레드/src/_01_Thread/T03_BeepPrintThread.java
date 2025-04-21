package _01_Thread;

import java.awt.Toolkit;

class NumPrint extends Thread {

}



public class T03_BeepPrintThread {

	public static void main(String[] args) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		NumPrint np = new NumPrint();
		
		np.start();
		
		for(int i=0; i<5; i++) {
			toolkit.beep();
			try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
