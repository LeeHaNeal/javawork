package _01_exception;

public class T03_nullPointer {

	public static void main(String[] args) {
		try {
		String data = null;
		System.out.println(data.toString());
		}catch(NullPointerException ne) {
			System.out.println("객체가 없습니다");
			System.out.println("메세지 : " +ne);
		}
		
		for(int i=1;i<=5;i++) {
			System.out.println(i);
		}
		
		
		
		
		
		
		
		
	}

}
