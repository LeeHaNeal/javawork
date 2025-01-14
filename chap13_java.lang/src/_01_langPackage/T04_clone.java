package _01_langPackage;

/*
  clone() : 객체 복제
  	1.반드시 clone하고자하는 클래스에 implements  Cloneable 반드시 넣어줘야 한다.
	 : 이 클래스는 복제할 수 있는 클래스이다라는것을 알려줄 목적이다.
	2. clone()을 오버라이딩 하지않아도 된다. 그러나 
		 Object클래스에 clone()메소드는 접근제어자가 protected라서 같은 java.lang패키지에 있어야함.
	3.  2번과 같은이유로 오버라이딩 해야함
*/
class Point implements  Cloneable{
	int x;
	int y;
	
	
	
	Point() {}
	Point(int x , int y){
		this.x = x;
		this.y = y;
	}

	
	// return의 자료형이 object클래스 사용할 때는 형변환을 계속 해줘야 한다.
	@Override
	public Object clone() {
		Object obj = null;
		try {
			obj = super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return obj;
		
		
	}
	
	class A { 
		int num =3 ;
		int getNum() {
			return num;
		}	
	}
	
	@Override
	public String toString () {
		return "x=" + x + " , y=" + y;
		
	}
	
	
}
public class T04_clone {

	public static void main(String[] args) {
		
		
		Point original = new Point(3,4);
		Point copy = (Point)original.clone();
		System.out.println("original객체 " + original);
		System.out.println("copy객체 " + copy);
		
		copy.x = 100;
		System.out.println("original객체 " + original);
		System.out.println("copy객체 " + copy);
		
		
		
		
		
		
		
		
	}

}
