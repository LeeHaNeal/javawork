package _10_ex;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMenu {
    private ArrayList<Book> books;
    private Scanner scan;

    public BookMenu() {
        books = new ArrayList<>();
        scan = new Scanner(System.in);
    }

  
    public void addBooks() {
        System.out.print("추가할 도서 이름: ");
        String title = scan.nextLine();

        System.out.print("작가 이름: ");
        String author = scan.nextLine();

        System.out.print("출판사: ");
        String publisher = scan.nextLine();

        books.add(new Book(title, author, publisher));
        System.out.println("도서가 추가되었습니다.");
    }

    
    public void checkBook() {
        if (books.isEmpty()) {
            System.out.println("현재 책 목록이 비어 있습니다.");
            return;
        }
        for (Book book : books) {
            System.out.println(book);
        }
    }

   
    public void searchBook() {
        System.out.print("찾으실 도서 제목: ");
        String title = scan.nextLine();
        boolean found = false;

        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                System.out.println(book);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

   
    public void deleteBook() {
        System.out.print("삭제할 도서 제목: ");
        String title = scan.nextLine();
        boolean removed = books.removeIf(book -> book.getTitle().equalsIgnoreCase(title));

        if (removed) {
            System.out.println("도서가 삭제되었습니다.");
        } else {
            System.out.println("해당 도서를 찾을 수 없습니다.");
        }
    }

  
    public void ascBook() {
        books.sort(null); 
        System.out.println("도서 목록이 제목 기준으로 오름차순 정렬되었습니다.");
        checkBook(); 
    }

    
    public void menu() {
        while (true) {
            System.out.println("\n*************** 메뉴 *************");
            System.out.println("1. 새 도서 추가");
            System.out.println("2. 전체 도서 조회");
            System.out.println("3. 도서 검색");
            System.out.println("4. 도서 삭제");
            System.out.println("5. 도서명 오름차순 정렬");
            System.out.println("0. 종료");
            System.out.print("선택: ");

     
            int select = scan.nextInt();
            scan.nextLine(); 

            switch (select) {
                case 1 -> addBooks();
                case 2 -> checkBook();
                case 3 -> searchBook();
                case 4 -> deleteBook();
                case 5 -> ascBook();
                case 0 -> {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                }
                default -> System.out.println("잘못된 입력입니다. 다시 시도하세요.");
            }
        }
    }
}
