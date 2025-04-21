package _08_interfacePolymorphism;

/*
	interface의 다형성
	- interface는 객체 생성 안됨
	- interface를 상속받은 클래스를 객체생성하여 그 객체를 interface타입으로 형변환
	


*/


public class product_main {

	public static void main(String[] args) {
		
		// interface는 객체생성이 안된다.
		//  Product product = new Product();
		
		product product = new Game();
		System.out.print(product + "의 ");
		product.powerOn();
		
		
		
		product = new Tv();
		
		
		
		
		
		
		

	}

}
