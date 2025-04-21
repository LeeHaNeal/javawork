package _03_StringBuffer;

public class T02_StringBuilder {

	public static void main(String[] args) {
		// StringBuffer와 사용법 동일하다.
		StringBuilder sb = new StringBuilder();
		
		sb.append("java");
		sb.append(" program study");		
		System.out.println(sb);
		
		
		
		sb.insert(4, "8");
		System.out.println(sb);
		
		sb.setCharAt(sb.length()-6, '짱');
		System.out.println(sb);
		
		
	}

}
