package chap02_casting02;

import java.util.Scanner;

public class Tast2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
		System.out.print("이름을 입력하세요: ");
		String name = scan.nextLine(); 
		
		System.out.print("성별을 입력하세요(남/여): ");
		String gender = scan.nextLine(); 
		
		System.out.print("나이를 입력하세요: ");
		int age = scan.nextInt(); 
		
		System.out.print("키를 입력하세요(cm): ");
		double height = scan.nextDouble(); 
		
		// 출력
		System.out.printf("키 %.1fcm인 %d살 %s %s님 반갑습니다^^%n", height, age, gender, name);
		
		System.out.println("--------------------------------------------");
		
		System.out.print("정수 두개 를 입력하세요 (띄워쓰기로): ");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1+num2));
		System.out.println(num1 + "-" + num2 + "=" + (num1-num2));
		System.out.println(num1 + "*" + num2 + "=" + (num1*num2));
		System.out.println(num1 + "/" + num2 + "=" + (num1/num2));
		
		System.out.println("--------------------------------------------");
		
		System.out.print("가로값을 입력하세요: ");
		double ga1 = scan.nextDouble();
		
		System.out.print("세로값을 입력하세요: ");
		double se1 = scan.nextDouble();
		
		double meon = ga1 * se1;
		double dul = (ga1+se1)*2;
		
		System.out.printf("면적: %.2f%n", meon);
		System.out.printf("둘레: %.2f%n", dul);
		
        System.out.println("--------------------------------------------");
           
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("문자열을 입력하세요 : ");
	        String input = scanner.nextLine();

	        if (input.length() < 3) {
	            System.out.println("입력한 문자열이 너무 짧습니다.");
	        } else {
	            // 처음 세 문자 추출
	            char first = input.charAt(0);
	            char second = input.charAt(1);
	            char third = input.charAt(2);

	            // 결과 출력
	            System.out.println("\n첫 번째 문자 : " + first);
	            System.out.println("두 번째 문자 : " + second);
	            System.out.println("세 번째 문자 : " + third);
	        }
		
        
		
    }
}
