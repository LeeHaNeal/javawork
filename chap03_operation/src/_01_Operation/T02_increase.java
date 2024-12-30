package _01_Operation;

public class T02_increase {

	public static void main(String[] args) {
		// ++ : 하나증가
		// -- : 하나감소
		
		
		int num = 10;
		num++; // 11
		num--; //10
		++num; //11
		--num; //10
		// 단일항일 때는 연산자가 앞이나 뒤나 상관없이 결과는 똑같다.
		
		// 항이 2개일때 연산을 하면 앞이나 뒤에 붙는것에 따라 결과가 달라짐
		num = 10;
		int num2 = 10;
		
		int result = ++num + ++ num2;
		
		
		System.out.println(result);
		
		num = 10;
		num2 = 10;
		// 증감연산자가 뒤에 붙으면 연산 먼저 하고 그 다음 나를 증가시킴
		result = num++ + num2++;
		System.out.println(result);
		System.out.println("num="+num +", num2="+ num2);
		
		
		
		num = 10;
		num2 = 10;
		result = ++num + num2++;
		
		num = 10;
		num2 = 10;
		result = --num + num2--;
		
		
	}

}
