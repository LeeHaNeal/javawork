package _05_singleton;

public class Book {
	
	private String title;
	private String author;
	private int price;
	private String publisher;

	public Book() {
		
	}
	
	
	public Book(String title, String author, int price , String publisher) {
	    this.title = title;
	    this.author = author;
	    this.price = price;
	    this.publisher = publisher;
	}
	

	 public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public String getPublisher() {
	        return publisher;
	    }


	    public void setTitle(String title) {
	        this.title = title;
	    }

	    public void setAuthor(String author) {
	        this.author = author;
	    }

	    public void setPrice(int price) {
	        this.price = price;
	    }

	    public void setPublisher(String publisher) {
	        this.publisher = publisher;
	    }

	
	public String printInfo() {
		return "제목 : " +  title + "\n저자 : " + author + "\n가격 : "
			+ price + "원" +"\n출판사 : " + publisher;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
