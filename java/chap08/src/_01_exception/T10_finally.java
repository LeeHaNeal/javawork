package _01_exception;
/*
	finally : 예외발생과 상관없이 무조건 싱행
	try ~ catch문 밖에 있는 프로그램도 예외 발생과 상관없이 무조건 실행
	-위 2개의 차이점
	return이 있을 때 : finally는 return이 있어도 무조건 실행.
					try ~ catch문 밖에 있는 프로그램은 실행을 안함.
	

*/
public class T10_finally {

	public static void main(String[] args) {
		
		
		int [] num = {1,2,3};
		try {
			System.out.println(num[0]);
			System.out.println(num[1]);
			return;
		}catch(Exception e) {
			System.out.println("index의 범위를 넘어섰습니다.");
		} finally {
			System.out.println("예외가 발생해도 실행 안해도 실행");
		}
		System.out.println("무조건 실행");
		
		
		
		
		
		
		
	}

}
