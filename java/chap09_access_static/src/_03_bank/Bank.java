package _03_bank;

public class Bank {
	
	// private 잔액
	// 입금 메서드  
	// 출금 메서드 (잔액보다 많으면 안됨)
	// getter 메서드(잔액에대한)
	 private double jan;

	  
	    public void plu(double plu) {
	        if (plu > 0) {
	        	jan += plu; 
	            System.out.println(plu + "원이 입금되었습니다. 현재 잔액: " + jan + "원");
	        } 
	    }

	   
	    public void cul(double cul) {
	        if (cul > 0 && jan >= cul) {
	        	jan -= cul; 
	            System.out.println(cul + "원이 출금되었습니다. 현재 잔액: " + jan + "원");
	        } else {
	            System.out.println("출금하려는 금액이 현재잔액보다 많습니다. 현재 잔액: " + jan + "원");
	        }
	    }

	   
	    public double getjan() {
	        return jan;
	    }
}