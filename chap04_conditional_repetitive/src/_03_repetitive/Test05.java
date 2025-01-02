package _03_repetitive;

import java.util.Scanner;

public class Test05 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		/*1.  주사위의 숫자 맞추기 게임
		    랜덤으로 주사위숫자(1~6숫자 중 1개) 만들기
		    사용자로 부터 숫자 입력받아서
		    숫자를 맞추면 '축하합니다. 맞췄습니다' 하고 끝내기
		    못맞췄으면 계속 물어보기
		
		
		java책 p111 ~ 113까지 문제 풀기
		
		while(true) {
		int random1 = (int)(Math.random() * 6)+1;
		
		
		System.out.println("주사위 1~6중에 뭔지 맞춰보세요 : ");
		int num1 = scan.nextInt();
		
			if(num1 == random1) {
				System.out.println("축하합니다.맞췄습니다.");
		
			} else {
				System.out.println("아닙니다.");
			}
			 System.out.println("------------------------");
		
			 
			int sum = 0; 
			 
			 for(int i=1; i<=100; i++) {
				if  (i % 5 == 0){
					sum += i;
				}
			 
		}
			 System.out.println("5의 배수의 합계는" + sum);
		
		
		System.out.println("------------------------");
		
		int evenSum = 0;
		int oddSum = 0;
		
		for (int i=1; i<=100; i++) {
			if(i % 2== 0) {
				evenSum += i;
			
			}
		}
		for(int j=1; j<=100; j++) {
			if(j % 2 == 1) {
				oddSum += j;
			}
		}
		System.out.println("짝수의 합계는 : " + evenSum);
		System.out.println("홀수의 합계는 : " + oddSum);
		
		System.out.println("------------------------");
		
		for(int x=1; x<=6; x++) {
			for (int y=1; y<=6; y++) {
				if(x + y == 6) {
					System.out.println(""+x+","+y);
				}
			}
		}
		
		System.out.println("------------------------");
		
		for (int i = 1; i <= 5; i++) { 
		    for (int j = 1; j <= i; j++) { 
		        System.out.print("*"); 
		    }
		    System.out.println(); 
		}
		
		System.out.println("------------------------");
		
		for (int i = 5; i >= 1; i--) { 
		    for (int j = 1; j <= i; j++) { 
		        System.out.print("*"); 
		    }
		    System.out.println(); 
		}
		System.out.println("------------------------");
		
		for (int i = 1; i <= 5; i++) { 
			
		    for (int j = 1; j <= 2*i-1; j++) { 
		        System.out.print("*"); 
		    }
		    System.out.println(); 
		}*/
		System.out.println("------------------------");
		
		int count =0;
		
		while(true) {
			int random1 = (int)(Math.random() * 6)+1;
			count++;
			System.out.println("굴린 결과: " + random1);
			if(random1 ==6) {
				System.out.println("총 주사위 굴린 횟수 : " + count);
				break;
			}
			 
			
			
		}
		
		
		
		
		
		
	}

}
