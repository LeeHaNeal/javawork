package _01_exception;
/*
 throw : 강제로 예외 발생 시키기
 	- 보통 테스트할 떄 사용
 	- 사용자 정의로 예외처리를 만들 때 
*/
public class T11_throw {

	public static void main(String[] args) {
		
		try {
			Exception e = new Exception("고의로 예외 발생 시킴");
			throw e;
		}catch (Exception e) {
				System.out.println("예외 메시지 : " + e.getMessage());
		}
		
		
		
		
		
		
		
		
		
	}

}
