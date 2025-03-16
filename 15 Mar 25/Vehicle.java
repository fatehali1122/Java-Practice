public class Vehicle{
	String model;
	String speed;

	public Vehicle(){
		this.model = "Honda";
		this.speed = "100";
	}
	public Vehicle(String model){
		this.model = model;
		this.speed = "100";
	}
	public Vehicle(String model, String speed){
		this.model = model;
		this.speed = speed;
	}

	public void display(){
		System.out.println(model+" "+speed);
	}

}