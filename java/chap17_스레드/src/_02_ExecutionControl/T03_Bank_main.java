package _02_ExecutionControl;

public class T03_Bank_main {

	public static void main(String[] args) {
		
		Runnable r= new ThreadBank();
		
		/*
		Thread th = new Thread(new ThreadBank());
		Thread th2 = new Thread(new ThreadBank());
		*/
		
		
		new Thread(r).start();
		new Thread(r).start();
		
	}

}
