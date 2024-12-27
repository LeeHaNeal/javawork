package chap02_variable;

import java.util.Scanner;

public class Scanner_06 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*		// 사용자에게 무엇을 해야되는지 써주는것이 좋다. 
				System.out.println("정수를 입력하세요 : ");
				int num1 = scan.nextInt();
				System.out.println("출력 값 :"+ num1);
				
				
				System.out.print("이름 입력 : ");
				// 문자열로 받을 때 next()
				String name = scan.next(); // 1개의 문자열 : Space bar가 없는곳 까지 출력
				System.out.println("이름 : " + name);
				
				
				System.out.println("당신은 학생입니까?(true , flase) :  ");
				// 논리형으로 받을때 netxtBoolean()
				boolean student = scan.nextBoolean();
				System.out.println("당신의 답은 = " + student);
				
				// 실수형으로 받을 때 nextDouble()
				// 문자열의 한 문장을 얻어올 때 nextLine() : enter를 칠때 까지
				scan.nextLine();
				// 24줄의 enter가 들어옴 nextLine()을 중간에 사용할 때는 한번 더 써줘서 앞의 enter를 넣어준다.
				// 혹은 맨 첫줄에 넣을 때는 상관 없음
				System.out.print("주소 입력 : ");
				String address = scan.nextLine();
				System.out.println("주소는 : " + address);
				
		
		System.out.print("성의 이니셜 1글자 입력 : ");
		char initial = scan.next().charAt(0);
		System.out.println("성의 이니셜은 : " + initial);
		*/

		System.out.println("정수 3개 입력(띄어쓰기로) >> ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		System.out.println("첫 번째 숫자 값 : " + num1);
		System.out.println("첫 번째 숫자 값 : " + num2);
		System.out.println("첫 번째 숫자 값 : " + num3);
		
		/*// 레포트 
		 * 1. 사용자로부터 2수를 입력받아 사칙연산을 출력하시오 
		 * 2. 사용자로 부터 연산자(1글자)를 입력받아 위 1번의 두 수를 연산하여 출력하시오
		*/	
		
	
	}

}
