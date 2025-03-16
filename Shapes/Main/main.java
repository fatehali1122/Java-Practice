package Main;
import Shapes_Area.rectangle;
import Shapes_Area.circle;
public class main{
	public static void main(String args[]){
		rectangle r = new rectangle(2,2);
		circle c = new circle(2);

		System.out.println("Area of Rect: "+r.area());
		System.out.println("Area of Circle: "+c.area());

	}
}