package _01_Operation;

import java.util.Scanner;

public class Test3 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		/*System.out.print("점수를 입력하세요: ");
		int num1 = scan.nextInt();
		
		
		String re1 = num1 < 0 ? "음수" : "양수";
		System.out.println(re1);
		
		System.out.println("------------------------------------------");
		
		
		System.out.print("점수를 입력하세요: ");
		int num2 = scan.nextInt();
		
		String re2 = num2 < 0 ? "음수" : num2 == 0 ? "0" : num2 >= 1 ? "양수" : "잘못입력했습니다";
		System.out.println(re2);
		
		System.out.println("------------------------------------------");
		
		System.out.print("점수를 입력하세요: ");
		int num3 = scan.nextInt();
		
		String result = (num3 % 2 == 0) ? "짝수" : "홀수";
		System.out.println(num3 + "은(는) " + result + "입니다.");
		
		
		System.out.println("------------------------------------------");
		
		System.out.print("인원를 입력하세요: ");
		int peo = scan.nextInt();
		
		System.out.print("사탕갯수를 입력하세요: ");
		int can = scan.nextInt();
		
		int candies = can / peo;  
		int remain = can % peo;  
		
		
		System.out.println("1인당 나누어줄 사탕 개수: " + candies);
		System.out.println("남은 사탕 개수: " + remain);
		
		System.out.println("------------------------------------------");
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		
		System.out.print("학년(숫자만) : ");
		int grade = scan.nextInt();
		
		System.out.print("반(숫자만) : ");
		int ban = scan.nextInt();
		
		System.out.print("번호(숫자만) : ");
		int bun = scan.nextInt();
		
		scan.nextLine();  // 버퍼를 비우기 위해 추가 (nextInt() 후 nextLine() 사용 시 필요)
		
		System.out.print("성별(M/F) : ");
		char gender = scan.nextLine().charAt(0);
		
		System.out.print("성적(소수점 둘째 짜리까지) : ");
		double score = scan.nextDouble();
		
		
		String genderText = (gender == 'M' || gender == 'm') ? "남학생" : "여학생";
		
		
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.\n", grade, ban, bun, name, genderText, score);
		
		
		    System.out.println("------------------------------------------");
		
		    System.out.print("나이를 입력하세요: ");
		    int age1 = scan.nextInt();
		
		
		    String na = (age1 <= 13) ? "어린이" : (age1 <= 19) ? "청소년" : "성인";
		
		    System.out.println(na);
		
		    System.out.println("------------------------------------------");
		
		    System.out.print("국어 점수를 입력하세요: ");
		    int korean = scan.nextInt();
		    
		    System.out.print("영어 점수를 입력하세요: ");
		    int english = scan.nextInt();
		    
		    System.out.print("수학 점수를 입력하세요: ");
		    int math = scan.nextInt();
		    
		    String res = (korean >= 40 && english >= 40 && math >= 40) && ((korean + english + math) / 3.0 >= 60) ? "합격" : "불합격";
		
		    System.out.println("당신은"+res+"입니다.");
		
		System.out.println("------------------------------------------");
		
		System.out.print("주민번호를 입력하세요: ");
		String jumin = scan.nextLine();
		char genderChar = jumin.charAt(7);
		
		String jumin1 = (genderChar == '1' || genderChar == '3') ? "남자" : "여자";
		
		System.out.println("당신은" + jumin1 + "입니다.");
		*/
		
		System.out.println("------------------------------------------");
		System.out.println("정수 입력시 첫번째 정수는 두번째 정수보다 작은 숫자여야함");
		System.out.print("첫번째정수를 입력하세요: ");
		int num1 = scan.nextInt();
		System.out.print("두번째정수를 입력하세요: ");
		int num2 = scan.nextInt();
		System.out.print("세번째정수를 입력하세요: ");
		int num3 = scan.nextInt();
		
		
		boolean result12 = (num3 <= num1  || num3 > num2 );
		
		System.out.println(result12);
		
		System.out.println("------------------------------------------");
		
		//사용자로부터 3개의 수를 키보드로 입력 받아 
	    //입력 받은 수가 모두 같으면 true, 아니면 false를 출력하세요
		
		System.out.print("첫번째정수를 입력하세요: ");
		int num11 = scan.nextInt();
		System.out.print("두번째정수를 입력하세요: ");
		int num22 = scan.nextInt();
		System.out.print("세번째정수를 입력하세요: ");
		int num33 = scan.nextInt();
		
		boolean rere = (num11 == num22 && num22== num33 && num11 == num33);
		System.out.println(rere);
	}

}
