package _01_conditional;

import java.util.Scanner;

public class T02_if_else {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 if(조건식){
		 조건식이 참 일때 실행할 구문
		 } else {
		 		조건식이 거짓일때 실행할 구문}
		 
		 */
		
		int score =85;
		if(score >=70) {
			System.out.println("축하합니다");
			System.out.println("합격입니다");
		} else {
			System.out.println("불합격입니다.");
			System.out.println("다음 기회에!");
		}
		System.out.println("-------------------------");
		
		if(score >=70) {
			System.out.println("축하합니다");
		} else {
			System.out.println("불합격입니다.");}
		
		int num1 = -100; //양수인지 음수인지 출력
		if(num1 >=0) {
			System.out.println("양수입니다.");
		} else {
			System.out.println("음수입니다.");
		}
		
		System.out.println("-------------------------");
		// 사용자로 부터 정수를 입력받아 짝수,홀수 구분
		//		String result = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.print("정수를 입력하세요: ");
		int num11 = scan.nextInt();
		
		if(num11 % 2 == 0) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");
		}
		
		/*if(num11 % 2 == 1 || num11 %2 == -1) {
			System.out.println("짝수");
		}else {
			System.out.println("홀수");} */
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
