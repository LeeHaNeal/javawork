package chap02_casting02;

import java.util.Scanner;

public class Tast2 {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in); 
        
		/*System.out.print("이름을 입력하세요: ");
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
		*/
        System.out.println("--------------------------------------------");
           
        System.out.print("문자열을 입력하세요: ");
		String mun1 = scan.nextLine(); 
		String mun2 = scan.nextLine(); 
		String mun3 = scan.nextLine(); 
		
		System.out.printf("첫번째 문자:"+ mun1);
		System.out.printf("두번째 문자:"+ mun2);
		System.out.printf("세번째 문자:"+ mun3);
		
        
		
    }
}
