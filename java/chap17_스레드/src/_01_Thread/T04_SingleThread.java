package _01_Thread;

public class T04_SingleThread {

	public static void main(String[] args) {
		
		
		
		long startTime = System.currentTimeMillis();
		
		for(int i=0; i <500; i++) {
			System.out.print("-");
		}
		System.out.println();
		long endTime = System.currentTimeMillis();
		System.out.println("소요 시간 : " + (endTime-startTime));
		
		
		for(int i=0; i <1000; i++) {
			System.out.print("|");
		}
		System.out.println();
		endTime = System.currentTimeMillis();
		System.out.println("소요 시간 : " + (endTime-startTime));
		
		
		
		
		
	}

}
