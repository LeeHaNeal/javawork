package _06_ex;

public class Book {
	
// 저자(String) , ISBN(int) , 가격(int) , 생성자 4개오버로딩
	
	 String Made;
	 int ISBN;
	 int price;

	    Book() {
	        this("알 수 없음", 0, 0);
	      
	    }

	    Book(String made1) {
	        this(made1, 0, 0);
	      
	    }

	    Book(String made1, int ISBN1) {
	        this(made1, ISBN1, 0);
	       
	    }

	    Book(String made1, int ISBN1, int price1) {
	        this.Made = made1;
	        this.ISBN = ISBN1;
	        this.price = price1;
	    
	    }

	    void printInfo() {
	        System.out.println("저자: " + Made);
	        System.out.println("ISBN: " + ISBN);
	        System.out.println("가격: " + price);
	    }
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
