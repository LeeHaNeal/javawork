package _03_repetitive;

import java.util.Scanner;

public class T03_while {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		/*
		 while(조건식){
		 		조건식이 참일때 계속 실행
		 }
		* 반복문에서 같이 사용
		-break : 반복문을 빠져 나올 때
		-continue : continue뒤에 구문은 실행하지 않고 다시 반복문 실행
		  */
		
		// for문을 while문으로
		// 출력 1 2 3 4 5 
		
		/*for(int i=1; i<=5; i++) {
			System.out.println(i);
		}
		*/
		
		int i = 1;  //초기식
		while(i<=5) { // 조건식
			System.out.println(i);
			i++; //증감식
		}
		System.out.println("-------------------------");
		
		
		// while문으로 1~10까지의 합계
		
	
		i = 1;
		int sum = 0;
		while(i<=10) {
			sum += i++;
		}
		System.out.println("1~10까지의 합계 : " + sum);
		System.out.println("-------------------------");
		
		i = 1;
		sum = 0;
		while(i<=10) {
			sum += ++i;
		}
		System.out.println("2~11까지의 합계 : " + sum);
		System.out.println("-------------------------");
		
		
		
		int count = 0;
		while(true) {
			System.out.println(++count);
			if(count==5) {
				break;
			}
			}
		
		while(true) {
			System.out.println("문자1개 (멈추려면 'q') 입력 :");
			char ch = scan.next().charAt(0);
			if(ch =='q') {
				break;
			}
			System.out.println(ch);
		}
		System.out.println("프로그램 종료");
		System.out.println("-------------------------");
		//continue
		// 1~100까지의합계중 3의 배수를 제외한 한계 구하기
		// 1+2+4+5+7+8+10+11+13....
		
		
		sum = 0;
		int j=1;
		for(j=1; j<=10; j++) {
			sum += j;
			
			if(sum >= 10)
				break;
		}
		System.out.println(j+"까지의합 :" + sum);
		System.out.println("-------------------------");
		
		sum = 0;
		int q=1;
		for(q=1; q<=100; q++) {
			if(q%3==0) {
				continue;
			}
			sum += q;
		
		}
		System.out.println("1~100까지 3의 배수를 제외한 합계 :" + sum);
		
		
		
		
		
		
		
		
		
		
		
		
		
		}
		
	}


