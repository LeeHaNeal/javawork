package _02_2차원_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		
		
		Scanner scan = new Scanner(System.in);
		
	/*	int[] arr = new int[10]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i] =  i+1; 
        }   
        System.out.println("배열 값 출력:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
		*/
	
	  /*int[] arr = new int[10]; 
	    for (int i = 0; i < arr.length; i++) {
	        arr[i] = 10 - i; 
	    }
	    System.out.println("배열 값 출력:");
	    for (int i = 0; i < arr.length; i++) {
	        System.out.print(arr[i] + " ");
	    }
	}*/
	
		/*	System.out.println("----------------------");		
			
			
			System.out.println("원하는만큼 배열 만들기 :");
			int size = scan.nextInt();
			
			int num[] = new int[size];
			
			for(int i=0; i<num.length; i++) {
				num[i] = i+1;
			}
			for(int i=0; i<num.length; i++) {
				System.out.println(num[i]);
			}*/
		/*	
			System.out.println("----------------------");		
			
			String[] gwa = {"사과", "귤", "포도", "복숭아", "참외"}; 
		String[] arr = new String[5];
		
		// 배열 복사
		for (int i = 0; i < gwa.length; i++) {
		    arr[i] = gwa[i];
		}
		
		System.out.println(arr[1]);*/
		
		
		
		System.out.println("----------------------");		

		
		
		//application
		System.out.println("문자열 입력 : ");
		String mun = scan.nextLine();
		
		System.out.println("검색할문자열 입력 : ");
		char ch1 = scan.next().charAt(0);
		
		int count = 0;
		System.out.println(mun+"에"+ch1+"가 존재하는 위치");
		for(int i=0; i<mun.length();i++) {
			if(mun.charAt(i) == ch1) {
				System.out.println(i + " ");
				count++;
			}
		}
		
		System.out.println("\n" + ch1 + "개수"+ count );
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	//  사용자로부터 정수값 5개를 배열에 입력
	// 오름차순으로 정렬하기(자리바뀜)
			
	/*	
		 int[] num = new int[5]; 
	    System.out.println("정수 5개를 입력하세요:");
	    for (int i = 0; i < num.length; i++) {
	        num[i] = scan.nextInt();
	    }
	    for (int i = 0; i < num.length - 1; i++) {
	        for (int j = 0; j < num.length - 1 - i; j++) {
	            if (num[j] > num[j + 1]) {
	                int temp = num[j];
	                num[j] = num[j + 1];
	                num[j + 1] = temp;
	            }
	        }
	    }
	    System.out.println("오름차순 정렬 결과:");
	    for (int n : num) {
	        System.out.print(n + " ");
	    }
	*/
		
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}}


