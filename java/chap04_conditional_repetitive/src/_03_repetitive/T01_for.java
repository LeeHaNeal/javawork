package _03_repetitive;

public class T01_for {

	public static void main(String[] args) {
		
		/*
		 반복분 : 원하는 갯수(조건이 맞을때까지)만큼 반복하여 실행하고자 할때
		 1. for
		 	for(초기식; 조건식; 증감식;) {
		 		실행문
		 	}
		 2. while : 조건이 맞을 때까지 반복 실행
		 3. do~while
		 */
		
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("어서오세요");
		System.out.println("-----------------------------");
		
		for(int i=1; i<=10; i++) {
			System.out.println("어서오세요");
		}
		System.out.println("-----------------------------");
		
		for(int i=1; i<=100; i++) {
			System.out.println(i+ "축하합니다");
		}
		System.out.println("-----------------------------");
		
		for(int i=100; i>=1; i--) {
			System.out.println(i+ ".감소");
		}
		System.out.println("-----------------------------");
		
		for(int i=1; i<=100; i=i+2) { //i=i+2
			System.out.println(i+ ".i값 출력");
		}
		// 1~100까지의 합계 구하기
		int sum = 0;
		for(int i=1; i<=10; i++) {
			sum += i; // sum = sum+i 와 같은것
			System.out.println("1~10의 합계 : "+ sum);
		}
		
		
		
		
		
		
		
		
	}

}
