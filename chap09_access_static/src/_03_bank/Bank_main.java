package _03_bank;

public class Bank_main {

	public static void main(String[] args) {
		Bank bk1 = new Bank();
		
		
		
		
		
		
		bk1.plu(100);
		bk1.plu(10000);
		
		bk1.cul(1000);
		bk1.cul(10000);
		System.out.println("현재잔액은 "+bk1.getjan()+ "입니다.");
	}

}
