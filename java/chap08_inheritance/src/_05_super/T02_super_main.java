package _05_super;
class parent2{
	int x = 10; // 인스턴스 변수
}

class Child2 extends parent2{
	int x = 200; // 인스턴스 변수
	void show () {
		int x = 500; // 지역 변수
		System.out.println("X = " + x); // 지역변수
		System.out.println("this.x = " + this.x); // 인스턴스 변수
		System.out.println("super.x = " + super.x); // 부모의 변수
		
		
	}
}




public class T02_super_main {

	public static void main(String[] args) {
		
		Child2 child = new Child2();
		
		child.show();
		
		
		
		
		
	}

}
