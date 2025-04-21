package _01_Thread;

public class T07_GroupThread {

	public static void main(String[] args) {
		
		ThreadGroup main = Thread.currentThread().getThreadGroup();
		String groupName = main.getName();
		System.out.println(groupName);
		
		
		ThreadGroup grp1 = new ThreadGroup("Group1");
		ThreadGroup grp2 = new ThreadGroup("Group2");
		ThreadGroup subgrp1 = new ThreadGroup("subgrp1");
		
		
		grp1.setMaxPriority(9);
		
		
		Runnable r = new Runnable() {
			public void run() {
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					
					e.printStackTrace();
				}
			}
		};
		
		// 생성자 Thread(ThreadGroup 변수명, Runnable 변수명 , String 이름)
		Thread th1 = new Thread(grp1,r,"th1");
		Thread th2 = new Thread(grp2,r,"th2");
		Thread th3 = new Thread(subgrp1,r,"th2");
		
		th1.start();
		th2.start();
		th3.start();
		
		System.out.println("List of ThreadGroup : " + main.getName());
		System.out.println("ACtive ThreadGroup : " + main.activeGroupCount());
		System.out.println("ACtive Thread : " + main.activeCount());
		
		
		
		
		
		
		
		
	}

}
