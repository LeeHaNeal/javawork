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
	
	  /* int[] arr = new int[10]; 
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
		/*System.out.println("----------------------");		
		
		String str[] = {"사과", "귤", "포도", "복숭아", "참외"};
		System.out.println(str[1]);
		System.out.println();
		
		
		
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
		*/
		
		/*System.out.println("----------------------");	
		
		
		char [] days = {"월","화","수","목","금","토","일"};
		System.out.print("0~6사이 숫자 입력 :" );
		
		int num6 = scan.nextInt();
		
		if(num6 >= 0 && num6 <=6) {
			System.out.println(days[num6] + "요일");
			
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		System.out.println();*/
		
		/*System.out.println("----------------------");	
		
		System.out.print("배열의 크기 입력 :");
		int num7 = scan.nextInt();
		
		int[] arr7 = new int[num7];
		
		int sum =0;
		for(int i=0; i<arr7.length;i++) {
			System.out.print(i+1 +"번째 값 입력 :");
			arr7[i] = scan.nextInt();
			sum += arr7[i];			
			
		}
		System.out.println("합 : " +  sum);*/
		
		/*	System.out.println("----------------------");	
			
			while(true) {
			System.out.print("3이상인 홀수의 정수 입력 : ");
			int num8 = scan.nextInt();
			
			if(num8 >=3 && num8%2 ==1 ) {
				
				
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		
			}*/
		
	//	System.out.println("----------------------");	
		
		/*
		while(true) {
			System.out.print("3이상인 홀수의 정수 입력 : ");
			int num8 = scan.nextInt();
			
			if(num8 >=3 && num8%2 ==1 ) {
				int value =1;
				int[] arr8 = new int[num8];
				for(int i=0; i<arr8.length; i++) {
					if(i< num8/2) {
						arr8[i] = value++;
					} else {
						arr8[i] = value--;
					}
					
					System.out.print(arr8[i] + " ");
				}
				
				break;
			}else {
				System.out.println("다시 입력하세요");
			}
		
			}*/
		/*System.out.println("----------------------");	
		
		String[] chickens = {"후라이드","양념","파닭","허니버터"};
		System.out.println("치킨 이름 입력 : ");
		String menu = scan.next();
		
		boolean flag = false;
		for(int i=0; i<chickens.length; i++) {
			if(menu.equals(chickens[i])){
				flag = true;
				break;
				
			}
		}
		
		if(flag)
			System.out.println(menu + "치킨은 배달 가능");
		else
			System.out.println(menu + "은 없는 메뉴 입니다.");
		
		// 11.  버블정렬
				int bubble[] = {68, 15, 35, 57, 23, 4};
		
				for(int i=0; i<bubble.length-1; i++) {
					boolean flag = false;
					for(int j=0; j<bubble.length-i-1; j++) {
						if(bubble[j] > bubble[j+1]) {
							int tmp = bubble[j];
							bubble[j] = bubble[j+1];
							bubble[j+1] = tmp;
							flag = true;
						}
					}
					if(!flag) {
						break;
					}
				}
				
				System.out.println(Arrays.toString(bubble));*/
		
		
		
		
		
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
		System.out.println("----------------------");	
		
	    // 12.
		 /*95    100     78   273  83.3
		   2     68     57    100   273  83.3
		   3     62     97     85    273  83.3
		   4     85     83     69    273  83.3
		   5     86     74     38    273  83.3*/
		int score[][] = {{95,100,78},
						{68,57,100},
						{62,97,57},
						{85,83,69},
						{86,74,38}};
		
		System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
		System.out.println("-----------------------------------------");
		
		
	        
	    for(int i=0; i<score.length; i++) {
	    	int sum = 0;
	    	for(int j=0;j<score[i].length; j++) {
	    		sum += score[i][j];
	    	System.out.println(score[i][j] + "\t");
	    	}
	    	System.out.printf("%d\t%.1f\n" + sum,(double)sum/score[i].length);
	    
	    }
	        
	       System.out.println("------------------------------------");
	        System.out.println("총점\t"  );
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	        
	}}


