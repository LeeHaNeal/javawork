package _04_interface2;

public class Inter_main {

	public static void main(String[] args) {
		
		InterClass ic = new InterClass();
		ic.print(5);
		ic.inMethod(2);
		System.out.println(ic.PI);
		
		 // Inter in = new Inter(); 인터페이스는 객체를 생성할 수 없다.
		// ic.PI = 4.567; 상수라서 변경못함
		// ic.MAX = 586 상수라서 변경못함
		
		System.out.println(ic.add(5, 8));
		
		
	}

}
