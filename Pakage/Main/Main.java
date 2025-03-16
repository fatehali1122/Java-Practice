package Main;
import MathUtils.Calculator;
public class Main{

	public static void main(String args[]){
		
		Calculator c = new Calculator();
		System.out.println("Sum = "+ c.add(2,3));
		System.out.println("Sub = "+ c.sub(4,3));

	}

}