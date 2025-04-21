package _01_langPackage;

class Equals extends Object{
	int value;
	Equals(int value){
		this.value = value;
	}
	
	@Override
	public boolean equals(Object obj ) {

		return value == ((Equals)obj).value;
	}
	
}




public class T01_equals {

	public static void main(String[] args) {
		Equals e1 = new Equals(10);
		Equals e2 = new Equals(10);
		
		// Object클래스 의 equals는 주소가 같은가의 결과가 나온다.
		// Object클래스 의 equals는 '=='를 한 결과와 같다.
		if(e1.equals(e2))
		System.out.println("e1과e2는 같다");
		else 
			System.out.println("e1과e2는 다르다.");
		// Equals 클래스에서 equals()를 값을 비교하는것으로 오버라이딩하고 난 후에는 값을 비교한 결과출력
		
		
		
		if(e1==e2)
			System.out.println("e1과e2는 같다");
		else 
			System.out.println("e1과e2는 다르다.");
		
		
		
		String str = "홍길동";
		String str1 = "홍길동";
		if(str.equals(str1))
			System.out.println("str과str1은 같다");
		else
			System.out.println("str과str1은 다르다.");
		
		
		
		
		
		
		
		
		
		
	}

}
