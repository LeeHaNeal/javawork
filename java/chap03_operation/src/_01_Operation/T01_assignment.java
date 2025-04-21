package _01_Operation;

public class T01_assignment {

	public static void main(String[] args) {
		// 사칙연산중 % 는 나머지
		int result = 10 %3;
		System.out.println("10을 3으로 나눈 나머지 : "+ result);
		
		
		
		result +=1; //result = result +1; 와 같은 말
		System.out.println(result);
		
		result *=3; // result = result *3 와 같은 말
		System.out.println(result);
		
		result -=3; // result = result -3 와 같은 말
		System.out.println(result);
		
		result /=2; // result = result /2 => 몫
		System.out.println(result);
		
		result = 7;
		System.out.println(result);
		
		result%=5; // result = result %2 => 나머지
		System.out.println(result);
		
		
		int num2 = 300_000_000; // 언더바는 사람이 보기 편하게 작성하고 정수가 아닌 문자열로 인식
		System.out.println(num2);
		
	}

}
