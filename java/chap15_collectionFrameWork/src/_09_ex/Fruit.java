package _09_ex;

public class Fruit implements Comparable<Fruit> {

    String name;
    int price;

    public Fruit(String name, int price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "과일이름: " + name + "\n가격: " + price;
       
    }

    @Override
    public int compareTo(Fruit o) {
        return Integer.compare(this.price, o.price); 
    }
}
