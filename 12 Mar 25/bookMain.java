public class bookMain{
	public static void main(String args[]){
		Book b1 = new Book("C++", "ABC", "100");
		Book b2 = new Book(b1);
		System.out.println(b1.title +","+b1.author+","+b1.price);
		System.out.println(b2.title +","+b2.author+","+b2.price);

	}
}