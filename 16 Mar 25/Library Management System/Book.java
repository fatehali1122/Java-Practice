public class Book{

	private String title;
	private Author author;

	public Book(String title, Author author){
		this.title = title;
		this.author = author;
	}
	public Book(String title){
		this.title = title;
		this.author = new Author("James Bond");
	}

	public void displayBook(){
		System.out.println("Title: "+title);
		System.out.println("Author: "+author.getAuthorName());

	}

}