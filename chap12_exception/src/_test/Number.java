package _test;

public class Number {
	public int add(int a,int b) throws NumberException{
		if(a<0 || b<0) {
			throw new NumberException("음수는 불가능함");
		}
		return a+b;
	}

}
