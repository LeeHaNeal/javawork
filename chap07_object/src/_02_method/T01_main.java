package _02_method;

public class T01_main {

	public static void main(String[] args) {
		
		
		/*T01_api_method m1 = new T01_api_method();
		m1.print1();
		System.out.println(m1.num1);
		
		m1.print2();
		
		System.out.println(m1.print2());
		
		int result = m1.print2();
		System.out.println(result);
		
		
		System.out.println();
		
		
		
		System.out.println(m1.print3());
		
		System.out.println(m1.print4());
		
		m1.print5(10);
		
		int sum = m1.print6(3, 10);
		System.out.println(sum);
		
		System.out.println(m1.print6(10, 100));
		
		m1.print7("더 조은", 100);
		
		*/
		
		T01_api_op op1 = new T01_api_op();
		int sum = op1.der(3, 10);
		System.out.println(sum);
		
		System.out.println(op1.der(5, 7));
		System.out.println(op1.der(654, 123));
		
		System.out.println(op1.minus(123, 11));
		System.out.println(op1.multuply(10, 10));
		System.out.println(op1.remainder(10, 2));
		System.out.println(op1.divide(7, 3));

		
		
		
		
		
	}

}
