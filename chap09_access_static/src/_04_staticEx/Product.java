package _04_staticEx;

public class Product {
	// 고유의 제품번호
	// 제품의 갯수(객체가 생성된 갯수)
	// 생성자(고유한 제품번호)
	
	static int count;
	private String gou;
	
	
	Product(){
		count++;
		this.gou = "더 조은 " + count;
		System.out.println(gou);
	}
	String gou() {
		return gou;
	}
	public static int getgouCount() {
        return count;
    }
	
	
	
	
}
