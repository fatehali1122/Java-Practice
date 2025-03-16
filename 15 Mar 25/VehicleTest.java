public class VehicleTest{

	public static void main(String args[]){
		Vehicle v1 = new Vehicle();
		Vehicle v2 = new Vehicle("Tayota");
		Vehicle v3 = new Vehicle("Suzuki","200");

		v1.display();
		v2.display();	
		v3.display();
	}
}