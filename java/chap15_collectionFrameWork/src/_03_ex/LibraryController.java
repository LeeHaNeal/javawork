package _03_ex;

import java.util.ArrayList;
import java.util.List;

public class LibraryController {
	Member member;
	List<Book> aList = new ArrayList<>();
	
	public LibraryController(Member member) {
		this.member = member;
	}
	
	void info(){
		System.out.println(member);
	}
	
	void insertBook() {
		aList.add(new Book("김치", "김치우", "치나라"));
		aList.add(new Book("우동", "김동우", "동나라"));
		aList.add(new Book("김치우동", "김동김", "우치나라"));
	}
	
	void insertBook(Book book) {
		aList.add(book);
	}
	
	List<Book> selectAll() {
		return aList;
	}
	
	Book searchBook(String bookTitle) {
		Book book = null;
		if(aList.isEmpty()) {
			System.out.println("책이 없습니다.");
			return book;
		}
		for(int i=0; i<aList.size(); i++) {
			if(bookTitle.equals(aList.get(i).getTitle())) {
				book = aList.get(i);
				break;
			}
		}
		return book;
	}
}