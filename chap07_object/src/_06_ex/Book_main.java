package _06_ex;

public class Book_main {

	public static void main(String[] args) {
		
		
	
		
		Book book1 = new Book();
        book1.printInfo();
        System.out.println("----------------");
        
        Book book2 = new Book("홍길동");
        book2.printInfo();
        System.out.println("----------------");
        
        Book book3 = new Book("이순신", 12345);
        book3.printInfo();
        System.out.println("----------------");
        
        Book book4 = new Book("강감찬", 98765, 15000);
        book4.printInfo();
		
		
		
		
		
	}

}
