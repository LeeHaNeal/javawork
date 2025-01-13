package _test;

import java.util.Scanner;

public class Pul {

	public static void main(String[] args) {
		
		   Pul pul = new Pul();
	        Scanner sc = new Scanner(System.in);
	        System.out.println("더할 숫자 두 개를 입력하시오 : ");

	        try {
	            int num1 = sc.nextInt();
	            int num2 = sc.nextInt();

	            if (num1 < 0 || num2 < 0) {
	                throw new NumberException("음수는 입력할 수 없습니다.");
	            }

	            int result = num1 + num2; 
	            System.out.println("결과 : " + result);
	        } catch (NumberException e) {
	            System.out.println("예외 발생: " + e.getMessage());
	        } catch (Exception e) {
	            System.out.println("입력 오류: 정수를 입력해야 합니다.");
	        }
	    }
	}