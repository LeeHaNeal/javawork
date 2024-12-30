package _01_Operation;

public class T03_compare {

	public static void main(String[] args) {
		// 비교 연산자(같은가) : == 
		//         (다른가) : !=
		
		int num1 = 10;
		int num2 = 50;
		
		boolean re1 = num1==num2;
		
		System.out.println("num1 과 num2가 같은가? :"+ re1);
		
		System.out.println("num1 과 num2가 같은가? :"+ (num1 == num2));
		System.out.println("num1 과 num2가 다른가? :"+ (num1 != num2));
	}

}
