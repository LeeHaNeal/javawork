package _02_polyBuyer;

public class Buyer {
	int money = 500;
	int bonusPoint;


	
	/*
	 - 매개변수로 객체를 받음
	   반환형 메서드이름(클래스명 변수명)
			-> 인자값은 반드시 클래스명으로 생성된 객체만 넘겨줘야한다.
		
	
	*/
	

	
	/*  제품의 갯수만큼 오버로딩을 해야함
	void buy(Computer com) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
	void buy(Tv tv) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
	void buy(GameDevice gd) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
	*/
	
	// 형변환을 하면 모든 제품을 다 받을 수 있다
	// 매개변수로 객체를 받음
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액부족");
			return;
		}
		money -= p.price;
		bonusPoint += p.bonusPoint;
		System.out.println(p + "를 구입함");
	}
}