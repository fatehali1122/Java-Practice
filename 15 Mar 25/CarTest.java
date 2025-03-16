public class CarTest{
	public static void main(String args[]){
		
		Car car = new Car();
		Car.Engine eng = car.new Engine();
		eng.displayEng();

		Car.Battery b = new Car.Battery();
		b.displayBat();

		new Car().displayLocal();

		Car.test();
		car.test1();
		
	}
}