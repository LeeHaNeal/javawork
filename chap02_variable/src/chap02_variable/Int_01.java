package chap02_variable;

public class Int_01 {

	public static void main(String[] args) {
		/*
		  변수 : 저장공간  
		  int : 정수를 저장하는 공간 (4byte(32bit))
		  double : 실수를 저정하는 공간
		  char : 문자"1개"
		  String : 문자"열"
		 */
		
		// 컴퓨터 언어는 2진수로 되어 있음 (0,1 두개로 이루어짐)
		// 1bit : 1개( 0 or 1 )
		// 1byte : 8bit
		
		
		// 자료형 변수명;
		// 변수명 = 값;
		
		int num1 = 5;
        int num2 = 3;

        // 4칙연산
        int sum = num1 + num2;        // 덧셈
        int difference = num1 - num2; // 뺄셈
        int product = num1 * num2;    // 곱셈
        int quotient = num1 / num2;   // 나눗셈 (정수 나눗셈)
        int remainder = num1 % num2;  // 나머지 연산

        // 결과 출력
        System.out.println("덧셈: " + sum);
        System.out.println("뺄셈: " + difference);
        System.out.println("곱셈: " + product);
        System.out.println("나눗셈: " + quotient);
        System.out.println("나머지: " + remainder);

		
		
		
	}

}