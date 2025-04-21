package _02_2차원_Array;

public class T01_2Array {

	public static void main(String[] args) {
		
		// 2차원 배열 [행index][열index]
		// 배열을 선언하면서 값을 넣을 때
		int[][] score2 = {{1,2,3,4,5}, // [0] 행의 index번호
						  {6,7,8,9,0}, // [1]
						  {7,6,5,4,9}}; // [2]
		// 열의 index번호 [0][1][2][3][4]
		System.out.println(score2[2][3]); // 4가 출력
		System.out.println(score2[0][1]); // 2가 출력
		
		
		
		
		for(int row =0; row<score2.length; row++) {
			for(int column=0; column<score2[0].length; column++) {
				System.out.print(score2[row][column] + " ");
			}
			System.out.println();
		} /* 값은 이렇게 나옴 : 12345
							67890
							76549*/
		
		
		int[][] score = {{1,2,3,4,5},
						 {6,7,8},
						 {7,6,5,4}}; 
		
		for(int row =0; row<score.length; row++) {
			for(int column=0; column<score[row].length; column++) {
				System.out.print(score[row][column] + " ");
			}
			System.out.println();
		}/* 값은 이렇게 나옴 : 12345
						   	678
							7654*/

	
		
		
		System.out.println("score의 행의 길이 : "+ score.length); //값 : 3
		System.out.println("score[0]의 열의 길이 : "+score[0].length); //값 : 5
		System.out.println("score[1]의 열의 길이 : "+score[1].length); //값 : 3
		System.out.println("score[2]의 열의 길이 : "+score[2].length); //값 : 4
		
		
		
		// 배열을 선언만 할때
		int[][] score3 = new int[4][3];
		
		// 배열의 길이
		
		int[][] score4 = {{1,2,3,4,5},
						{6,7,8,9,0},
						{7,6,5,4,9}}; 
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
