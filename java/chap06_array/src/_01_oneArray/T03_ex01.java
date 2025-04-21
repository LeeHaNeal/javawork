package _01_oneArray;

public class T03_ex01 {

	public static void main(String[] args) {
		
		// 1. 총점과 평균 구하기
		int score[] = {100,98,49,78,86};
		int sum =0;
		
		for(int i=0; i<score.length; i++) {
			sum += score[i];
		}
		
		double aver = (double)sum/score.length;
		
		System.out.println("총점" + sum);
		System.out.println("평균" + aver);
		
		// 2. 최대값과 최소값 구하기 //최소값 변수하나 최대값 변수 하나 넣기
		int[] num = {83, 70, 27, 49, 20, 86, 90, 83, 58, 29};
        
        // 최대값과 최소값 초기화 (배열의 첫 번째 값 사용)
        int max = num[0];
        int min = num[0];
        
        // 최대값과 최소값 찾기
        for (int i = 1; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i]; 
            }
            if (num[i] < min) {
                min = num[i]; 
            }
        }
        
        // 결과 출력
        System.out.println("최대값은: " + max);
        System.out.println("최소값은: " + min);
		
		
		
		// 결과 : 최소값 : 20 
		// 		 최대값 : 90
		
		
	
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
	}
	}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	


