package chap02_variable;

import java.util.Scanner;

public class Report_08 {

	public static void main(String[] args) {
		// 사용자로부터 국어 , 수학 , 컴퓨터의 점수를 입력받아
		// 총점과 평균(소수점2째자리까지(반올림)) 출력
		
		 Scanner scan = new Scanner(System.in);
	       
	        System.out.print("국어 점수를 입력하세요: ");
	        int kor = scan.nextInt();
	        
	        System.out.print("수학 점수를 입력하세요: ");
	        int math = scan.nextInt();
	        
	        System.out.print("컴퓨터 점수를 입력하세요: ");
	        int com = scan.nextInt();
	        
	        // 총점과 평균 계산
	        int totalScore = kor + math + com;
	        double average = totalScore / 3.0;
	        
	        
	        
	        // 결과 출력
	        System.out.println("총점: " + totalScore);
	        System.out.printf("평균: %.2f\n", average);
	        
	       

		
	}

}
