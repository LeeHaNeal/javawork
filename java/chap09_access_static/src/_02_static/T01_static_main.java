package _02_static;

public class T01_static_main {

	public static void main(String[] args) {
		
		
			T01_static ts1 = new T01_static();
		
			ts1.num = 10;
			System.out.println("----------------");
			ts1.numSt = 100;
			System.out.println("----------------");
			System.out.println(ts1.num);
			System.out.println("----------------");
			System.out.println(ts1.numSt);
			System.out.println("----------------");
			ts1.printIn();
			System.out.println("----------------");
			ts1.printSt();
			System.out.println("----------------");
			T01_static ts2 = new T01_static();
			System.out.println("----------------");
			System.out.println(ts2.num);
			System.out.println("----------------");
			System.out.println(ts2.numSt);
			System.out.println("----------------");
			ts2.printIn();
			System.out.println("----------------");
			ts2.printSt();
			System.out.println("----------------");
			
			// 정적 필드는 객체를 생성하지 않고도 사용가능
			System.out.println(T01_static.nameSt);
			System.out.println("----------------");
			System.out.println(T01_static.numSt);
			System.out.println("----------------");
			T01_static.printSt();
		
		
		

	}

}
