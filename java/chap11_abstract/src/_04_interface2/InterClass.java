package _04_interface2;


// interface는 다중상속 가능
public class InterClass implements Inter , Inter2{

	@Override
	public void print(int a) {
		System.out.println("받은 값 : " + a);
		
		
		
	}

	@Override
	public void inMethod(int a) {
		System.out.println("매개변수가 없습니다.");
		
	}

	@Override
	public String inStr(String name) {
		
		
		return "이름 : " + name;
	}

	@Override
	public int add(int x, int y) {
		
		return x+y;
	}
	
}
