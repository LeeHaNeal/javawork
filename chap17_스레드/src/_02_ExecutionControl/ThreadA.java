package _02_ExecutionControl;

public class ThreadA extends Thread{
	boolean stop = false;	//스레드 종료시 필드사용
	boolean work = true;	// yield 메소드 호출한 시점을 알기위해 
	@Override
	public void run() {
		while(!stop) {
			if(work) {
				System.out.println("ThreadA 작업하기");
			} else {
				Thread.yield();
			}
		}
		System.out.println("ThreadA 종료");
	}

}
