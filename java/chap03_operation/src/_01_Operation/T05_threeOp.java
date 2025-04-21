package _01_Operation;

import java.util.Scanner;

public class T05_threeOp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 삼항 연산자
		/*
		 조건식 ? 조건이 참일때 실행 : 조건이 거짓일때 실행
		 */

			int num1 = 10;
			int num2 = 7;
			
			String result = num1 < num2 ? "Num1의 숫자가 더 작다." : "Num1의 숫자가 더 크다.";
			System.out.println(result);
			
			System.out.println("------------------------------------------");
			
			
			char re = num1 > num2 ? '소' : '대';
			System.out.println("Num2의 숫자는 Num1의 숫자보다 "+ re);
			
		System.out.println("------------------------------------------");
		// Num3의 값을 절대값으로 변경하기 
		int num3 = -8;
		int re2 = num3 < 0 ? -num3 : num3;
		System.out.println(re2);
		
		System.out.println("------------------------------------------");
		// 사용자로 부터 점수를 입력받아
		// 80점 이상이면 합격 그렇지 않으면 불합격을 출력하기
		System.out.print("점수를 입력하세요: ");
		int score = scan.nextInt();
		
		String result2 = score >= 80 ? "합격" : "불합격";
		System.out.println("시험에" + result2+"했습니다!");
		
		System.out.println("------------------------------------------");
		
		
		System.out.print("점수를 입력하세요: ");
		int score1 = scan.nextInt();
		String result3 = score1 > 100 ? "잘못 입력했습니다":
			score1 >= 90 ? "A" :
			score1 >= 80 ? "B" :
			score1 >= 70 ? "C" :
			score1 >= 60 ? "D" :
			score1 >= 0 ? "F학점" : "잘못 입력했습니다";
		System.out.println("이번학기의 학점은"+result3+"입니다");
		
		System.out.println("------------------------------------------");
		
		
		
	}

}
