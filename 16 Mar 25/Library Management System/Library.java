public class Library{

	private Book[] books;
	private String name = "XYZ Library";

	public Library(Book[] books){
		this.books = books;
	}

	public void displayLibrary(){
		System.out.println(name);
		
		System.out.println("Books: ");

		for(int i =0;i<books.length;i++){
			books[i].displayBook();
		}
	}
}