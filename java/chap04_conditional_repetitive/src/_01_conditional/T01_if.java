package _01_conditional;

public class T01_if {

	public static void main(String[] args) {
		// 조건문 : if문 과 switch~case문 두 가지가 있다.
		/*
		 if문 형식 
		 if(조건식) {	
		 	조건식이 참일 때 실행}
		 - 중괄호는 참일 때 실행하는 구문이 1줄이면 생략 가능
		 - 참일 때 실행하는 구문이 1줄 이상이면 반드시 중괄호를 넣어준다.
		 */
		
		int num = 100;
		if (num == 100) {
			System.out.println("100점입니다.");
	}
		
		if(num > 80) {
			System.out.println("축하합니다");
			System.out.println("합격입니다.");
		}
		
		System.out.println("IF문과 상관없이 출력");
		
		
		
		
}
}