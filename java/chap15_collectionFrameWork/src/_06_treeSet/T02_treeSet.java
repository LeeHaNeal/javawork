package _06_treeSet;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class T02_treeSet {

	public static void main(String[] args) {
		
		  Scanner scan = new Scanner(System.in);
	        System.out.print("돈을 입력하세요 (5000원 이상): ");
	        int pay = scan.nextInt();

	       
	        if (pay < 5000) {
	            System.out.println("금액이 부족합니다. 최소 5000원 이상 입력해주세요.");
	            return; 
	        }

	    
	        int Count = pay / 5000;

	     
	        for (int i = 1; i <= Count; i++) {
	            Set<Integer> set = new TreeSet<>();
	            while (set.size() < 6) {
	                set.add((int) (Math.random() * 45) + 1);
	            }
	            System.out.println(i + "번째 로또 번호 : " + set);
	        }
		
		
		
		
		
	}

}
