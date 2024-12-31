package _01_conditional;

import java.util.Scanner;

public class Test04 {

    public static void main(String[] args) {
        // Scanner 선언
        Scanner scan = new Scanner(System.in);

		/*// 국어, 영어, 수학 점수를 입력받아 합격 여부 확인
		System.out.print("국어 영어 수학 점수를 입력하세요: ");
		int kor = scan.nextInt();
		int eng = scan.nextInt();
		int math = scan.nextInt();
		
		double average = (kor + eng + math) / 3.0;
		
		if (kor >= 40 && eng >= 40 && math >= 40 && average >= 60) {
		    System.out.println("합격");
		} else {
		    System.out.println("불합격");
		}
		
		System.out.println("------------------------------------------");
		
		// 로그인 로직
		String coId = "id1234";   // 고정 아이디
		String coPassword = "1234";  // 고정 비밀번호
		
		// Scanner의 남아 있는 개행 문자 처리
		scan.nextLine(); // 버퍼 비우기
		
		System.out.println("아이디 입력");
		String id = scan.nextLine();
		System.out.println("비밀번호 입력");
		String Bi = scan.nextLine();
		
		if (id.equals(coId) && Bi.equals(coPassword)) {
		    System.out.println("로그인 성공");
		} else if (!id.equals(coId) && Bi.equals(coPassword)) {
		    System.out.println("아이디가 틀렸습니다.");
		} else if (id.equals(coId) && !Bi.equals(coPassword)) {
		    System.out.println("비밀번호가 틀렸습니다.");
		} else {
		    System.out.println("아이디와 비밀번호가 모두 틀렸습니다.");
		}
		*/
        System.out.println("------------------------------------------");
        //double average = (kor + eng + math) / 3.0;
        
        System.out.println("키를 입력하세요");
        double height = scan.nextDouble();
        System.out.println("몸무게를 입력하세요");
        double mom = scan.nextDouble();
        
        double bmi = (mom/(height*height));
        
        if (bmi < 18.5) {
        	System.out.println("저체중");
        } else if (bmi >= 18.5 && bmi < 23) {
        	System.out.println("정상체중");
        } else if (bmi >= 23 && bmi < 25) {
        	System.out.println("과체중");
        } else if (bmi >= 25 && bmi < 30) {
        	System.out.println("비만");
        } else if (bmi >=30) {
        	System.out.println("고도 비만");
        } else {
        	System.out.println("잘못측정");
        }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
