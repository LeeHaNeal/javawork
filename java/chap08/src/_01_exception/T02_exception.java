package _01_exception;

public class T02_exception {

	public static void main(String[] args) {
		System.out.println(1);
		System.out.println(2);
		
		try {
			System.out.println(3);
			System.out.println(4/0);  // (여기서 부터 오류가 발생해서 출력이 안됨 ) 출력값 : 1 2 3 예외 처리 함
			System.out.println(5);
		}catch(Exception ex) { 
			System.out.println("예외 처리 함");
		}
		
		
		
		
	}

}
