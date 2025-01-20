package _09_ex;

import java.util.TreeSet;

public class Comparator_main {

    public static void main(String[] args) {

        
        TreeSet<Fruit> treeSet = new TreeSet<>(new Descending());

        
        treeSet.add(new Fruit("사과", 20000));
        treeSet.add(new Fruit("배", 30000));
        treeSet.add(new Fruit("바나나", 15000));
        treeSet.add(new Fruit("용과", 40000));
       
        for (Fruit fruit : treeSet) {
            System.out.println(fruit);
        }
    }
}
