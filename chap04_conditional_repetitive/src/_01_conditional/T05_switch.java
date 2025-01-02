package _01_conditional;

import java.util.Scanner;

public class T05_switch {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// switch ~ case 문
		/*    
		 switch(변수){
		 	case 1 :
		 		변수에 들어있는 값이 1일때 실행;
		 		break;
		 	case 2 :
		 		변수에 들어있는 값이 2일때 실행;
		 		break;
		 	defalut : 
		 		변수에 들어있는 값이 1,2를 제외한 나머지 일때 실행;
		 	}
		 
		  
		
		int num = 2;
		switch(num) {
		case 1:
			System.out.println("1입니다");
			break;
		case 2:
			System.out.println("2입니다.");
			break;
		case 3 :
			System.out.println("3입니다.");
			break;
		default:
			System.out.println("1,2,3을 제외한 다른 숫자");	
		}
		
		System.out.println("---------------------");
		
		
		char ch ='k';
		switch(ch) {
		case 'k' : 
			System.out.println("김씨입니다.");
			break;
		case 'l' :
			System.out.println("이씨입니다.");
			break;
		case 'p' :
			System.out.println("박씨입니다.");
			break;
		default:
			System.out.println("성이 김,이,박씨가 아닙니다.");
			
		}
		
		System.out.println("---------------------");
		
	
		
		System.out.println("태어난 월을 입력하세요 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1:
		case 2:
		case 12:
			System.out.println("겨울에 태어났군요");
			break;
		case 3:
		case 4:
		case 5:
			System.out.println("봄에 태어났군요");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println("여름에 태어났군요");
			break;
		case 9  :
		case 10 :
		case 11 :
			System.out.println("가을에 태어났군요");
			break;
		default :
			System.out.println("잘못 입력 하셨습니다. 숫자로 기입해 주세요");
		}*/

		// 문) 연산할 두 숫자와 연산자를 입력받아 연산한 결과 출력

		System.out.println("연산할 두 숫자를 입력하세요 : ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();

		System.out.println("연산자를 입력하세요(+,-,*,/,%) : ");
		char op = scan.next().charAt(0);

		double result;

		switch (op) {
		case '+':
			result = num1 + num2;
			System.out.println(num1 + "+" + num2 + "=" + result);
			break;
		case '-':
			result = num1 - num2;
			System.out.println(num1 + "-" + num2 + "=" + result);
			break;
		case '*':
			result = num1 * num2;
			System.out.println(num1 + "*" + num2 + "=" + result);
			break;
		case '/':
			result = num1 / num2;
			System.out.println(num1 + "/" + num2 + "=" + result);
			break;
		case '%':
			result = num1 % num2;
			System.out.println(num1 + "%" + num2 + "=" + result);
			break;
		default:
			System.out.println("잘못입력");
		}
		System.out.println("---------------------");
		
		
		
		
		
	}

}
