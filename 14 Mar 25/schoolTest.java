public class schoolTest{
	public static void main(String args[]){
		School s = new School("DPS",new Student[]{new Student("Fateh Ali",18,new Grade[]{new Grade("Maths",90),new Grade("Phy",80),new Grade("Chem",70)}),new Student("Fateh Ali",18,new Grade[]{new Grade("Maths",90),new Grade("Phy",80),new Grade("Chem",70)}),new Student("Fateh Ali",18,new Grade[]{new Grade("Maths",90),new Grade("Phy",80),new Grade("Chem",70)})});
		s.display();
	}
}