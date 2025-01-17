package _04_set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class T01_HashSet {

	public static void main(String[] args) {
		
		
		//HashSet<Integer> set1 = new HashSet();
		Set<String> set2 = new HashSet();
		
		set2.add("a");
		set2.add("b");
		set2.add("c");
		set2.add("d");
		
		
		System.out.println("set에 size : : " + set2.size());
		
		
		
		
		Iterator<String> iterator = set2.iterator();
		
		 while (iterator.hasNext()) {
	       String str = iterator.next();
	       System.out.println(str);
		 }
		System.out.println("-----------------------------");
		
		
		
		
		iterator = set2.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			if(str.equals("b"))
				iterator.remove();
			}
	
		System.out.println(set2.iterator());
		
		System.out.println("-----------------------------");
		
		
		iterator = set2.iterator();
		
		 while (iterator.hasNext()) {
	       String str = iterator.next();
	       System.out.println(str);
		 }
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
