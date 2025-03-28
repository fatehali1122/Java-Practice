public class Main{
	public static void main(String args[]){
		Library lib = new Library(new Book[]{new Book("Mit",new Author("Atmaca")),new Book("007")});
		
	
		lib.displayLibrary();
	}
}