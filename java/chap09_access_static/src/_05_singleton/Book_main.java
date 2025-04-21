package _05_singleton;

import java.util.Scanner;

public class Book_main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
			
		 Book book1 = new Book("김치", "김치민", 15000 , "김치나라");
	     Book book2 = new Book("우동", "김우동", 25000 , "우동나라");
	     Book book3 = new Book("김치우동", "김치동", 35000 , "치동나라");
	     
	     Book[] books = {book1, book2, book3};
	     
        System.out.println("찾으시려고 하는 책을 입력하세요 : ");
        String bk = scan.nextLine();
        
        boolean found = false;
        for (Book book : books) {
            if (book.getTitle().equals(bk)) {
             System.out.println(book.printInfo());         
            	found = true;
                break;  
            }
        }

        if (!found) {
            System.out.println(bk + " 책을 찾을 수 없습니다.");
        }
        
	}

}
