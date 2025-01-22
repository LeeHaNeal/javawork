package _01_exception;
// NumberFormatException : 문자를 수자로 형 변환시 숫자로 변환할 수 없는 문자가 포함 되었을 때
public class T05_numberFormat {

	public static void main(String[] args) {
		/*String[] str = {"23","17","a","3.141592"};
		int num = Integer.parseInt(str[0]);
		System.out.println(num);
		 System.out.println(Integer.parseInt(str[2])); // 예외 발생
		 System.out.println(Integer.parseInt(str[3]));  예외 발생
		*/		
		String[] str = {"23","17","a","3.141592"};
		int i=0;
		try {
			for(int i1 =0; i1<str.length;i1++) {
				int num = Integer.parseInt(str[i1]);
				System.out.println(num);
			}
			
		}catch (NumberFormatException ne) {
			System.out.println(str[i]+"는 정수로 변환할 수 없습니다.");
		}
		
		
	}

}
