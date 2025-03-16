public class St_test{
	public static void main(String args[]){
		Student s1 = new Student("1", "Fateh");
		Student s2 = new Student("1", "Ali");
		if(s1.id.equals(s2.id))
			System.out.println("ID ARE EQUAL");
	}
}