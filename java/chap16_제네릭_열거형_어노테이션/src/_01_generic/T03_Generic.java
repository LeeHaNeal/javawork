package _01_generic;

import java.util.ArrayList;

class Fruit{public String toString() {return "Fruit";}}
class Apple extends Fruit{public String toString() {return "Apple";}}
class Grape extends Fruit{public String toString() {return "Grape";}}
class Tjoeun{public String toString() {return "Tjoeun";}}
class Box<T>{
	ArrayList<T> list = new ArrayList<>();
	void add(T item) {list.add(item);}
	T get(int index) {return list.get(index);}
	int size() {return list.size();}
	public String toString() {return list.toString();}
	
}


public class T03_Generic {

	public static void main(String[] args) {
		Box<Fruit> fruitbox = new Box<>();
		Box<Apple> applebox = new Box<>();
		Box<Tjoeun> tjoeunbox = new Box<>();
		
		
		fruitbox.add(new Fruit()); // 자신의 타입 넣음
		fruitbox.add(new Apple()); // 자식의 타입을 부모타입으로 자동형 변환
		fruitbox.add(new Grape()); // 자식의 타입을 부모타입으로 자동형 변환
		// fruitbox.add(new Tjoeun()); // 오류 : 타입이 맞지 않음
		
		
		
		applebox.add(new Apple()); // Apple 만 넣을 수 있다.
		// applebox.add(new Fruit()); // 오류 : 타입이 맞지 않음
		
		
		tjoeunbox.add(new Tjoeun()); // Tjoeun만 넣을 수 있다.
		
		System.out.println(fruitbox);
		System.out.println(applebox);
		System.out.println(tjoeunbox);
		
		
		
		
		
		
		
		
		
		
	}

}
