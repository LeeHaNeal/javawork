package _04_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

// equals()를 오버라이딩 했을 때 hashCode()를 반드시 오버라이딩 해야됨


public class T04_HashSet {
    public static void main(String[] args) {
    
    	
    	Set<Integer> set = new HashSet<>();
    	
    	for(int i=0; i<6; i++)
    	set.add((int)(Math.random()*45)+1);
    	
    	
    	for(Integer i  :set) {
    		System.out.print(i+ ", ");
    	}
    	System.out.println();
    	
    	
    	
    	
    	List<Integer> list1 = new ArrayList(set);
    	Collections.sort(list1);
    	System.out.println(list1);
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    	
    }
}
