public class Book{

	String title;
	String author;
	String price;
	public Book(String title, String author, String price){
		this.title = title;
		this.author = author;
		this.price = price;
	}
	public Book(Book other){
		this.title = other.title;
		this.author = other.author;
		this.price = other.price;
	}

}