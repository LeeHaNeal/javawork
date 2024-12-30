package chap02_casting02;

import java.util.Scanner;

public class Test1 {

	public static void main(String[] args) {
	
		
			Scanner scan = new Scanner(System.in);
		 
	        System.out.print("문자를 1개 입력하세요: ");
	        char ch1 = scan.next().charAt(0);
	       
	        int uni = (int) ch1;
	        System.out.println(ch1 + "의 유니코드는 " + uni + "입니다.");
	        
	      
	        int iNum1 = 10;
	        int iNum2 = 4;
	        float fNum = 3.0f;
	        double dNum = 2.5;
	        char ch = 'K';

	       // 3.1  iNum1 / iNum2의 몫 출력
			 
	        int quo = iNum1 / iNum2;
	        System.out.println("iNum1 / iNum2의 결과 : " + quo);
	        
	       // 3.2  iNum2 * dNum 한 결과를 변수에 넣고 출력하기
			 double result = iNum2 * dNum;
	        System.out.println("iNum2 * dNum결과: " + result);
	        
	        //3.3  iNum1의 값이 10.0으로 출력되게 하기;
	        System.out.println("iNum1의 결과: " + (double)iNum1);
	        
	        //3.4  iNum1 / iNum2 한 결과 소수점까지 나오게 출력하기
	        System.out.printf("iNum1 / iNum2의 결과: %.1f%n",+ (double)iNum1 / iNum2);
	        
	        //3.5  iNum1 / fNum 한 결과 3이 출력되게 하시오
			 int result3 = (iNum1 / (int) fNum);
	        System.out.println(" iNum1 / fNum의 결과: " + result3);
	        
	        //3.6  iNum1 / fNum 한 결과 소수점 13자리이상까지 나오게 하시오
			 double divisionResult2 = iNum1 / fNum;
	        System.out.printf("3.6 iNum1 / fNum의 결과: %.13f%n", divisionResult2);
	        //3.7  ch변수의 유니코드 출력하기  
	        int unicode = (int) ch;
	        System.out.println("ch의 유니코드: " + unicode);
	        
	        //3.8  ch변수에 1을 더해 L 이 출력되게 하시오
	        char incremen = (char) (ch + 1);
	        System.out.println("ch+1의 결과: " + incremen);
	        
	        
	        
	        
			
	}

}
