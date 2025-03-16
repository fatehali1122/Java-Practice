public class CalMain{
	public static void main(String args[]){
		Calculator c = new Calculator();
		
		System.out.println(c.subtract(5,4));
		System.out.println(c.subtract(7,4,1));
		System.out.println(c.subtract(5.9,4.1));

	}
}