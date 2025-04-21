package _01_polymorphism;



class Parent{
	void method1(){
		System.out.println("parent method1()");
	}
	void method2() {
		System.out.println("parent method2()");
	}
}
class Child extends Parent {
	
	// 어노테이션 	@Override : 부모에게 똑같은 메소드가 있는지 알려준다.
	@Override
	void method2() {
		System.out.println("Child method2()");
	}
	void method3 () {
		System.out.println("child method3()");
	}
}


public class T02_poly_overriding_main {

	public static void main(String[] args) {
		
		Child child = new Child();
		Parent parent = new Parent();
		// 오버라이딩한것은 형 변환과 상관없이 무조건 오버라이딩한 메소드 호출
		parent.method2(); // method3은 쓰지못함 
		
		
		
		
		
	}

}
