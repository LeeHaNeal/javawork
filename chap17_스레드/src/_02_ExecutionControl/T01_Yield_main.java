package _02_ExecutionControl;


public class T01_Yield_main {

	public static void main(String[] args) {
			
		ThreadA tha = new ThreadA();
		ThreadB thb = new ThreadB();
		
		tha.start();
		thb.start();
		System.out.println("------------------");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tha.work = false;
		System.out.println("------------------");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		tha.work = true;
		System.out.println("------------------");
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		tha.work = true;
		thb.work = true;
		
		
		
		
		
	}

}
