package _01_langPackage;

class Dog{
	String kind;
	int age;
	Dog(){
		
	}
	
	Dog(String kind , int age){
		this.kind = kind;
		this.age = age;
	}
	/*@Override
	public String 
	*/
	
	
}



public class T03_toStirng {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog();
		Dog dog2 = new Dog("불독" , 5);
		

		// 객체를 넣은 변수를 출력하면 toString()메소드가 호출됨
		// Object클래스의 tosTring() :  패키지명.클래스명@해시코드 (16진수로)
		System.out.println(dog1);
		System.out.println(dog1.toString());
		System.out.println("-----------------");
		
		
		System.out.println(dog2);
		System.out.println(dog2.toString());
		System.out.println("-----------------");

		// 객체를 넣는 변수의 값이 null일때는 null을 출력해줌 ( toString()을 호출하지않음)
		Dog dog3 = null;
		System.out.println(dog3);
		
		
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}
