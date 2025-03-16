public class Car{

	class Engine{
		void displayEng(){
			System.out.println("Engine Started.");
		}
	}
	static class Battery{
		void displayBat(){
			System.out.println("Battery.");
		}
	}
	public void displayLocal(){
		class localInner{
			void displayLocalInner(){
				System.out.println("Local Inner Class");
			}
		}
		localInner obj = new localInner();
		obj.displayLocalInner();
	}
	public static void test(){
		System.out.println("Static Method.");

		}
	public  void test1(){
		System.out.println("Non Static Method");

		}


}