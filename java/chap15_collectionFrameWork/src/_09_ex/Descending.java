package _09_ex;

import java.util.Comparator;

public class Descending implements Comparator<Fruit> {
   
	
	@Override
    public int compare(Fruit o1, Fruit o2) {
		if(o1 instanceof Comparable && o2 instanceof Comparable) {
			Comparable c1 =(Comparable)o1;
			Comparable c2 =(Comparable)o2;
			return c2.compareTo(c1);
    }
		return 0;
	}
}
