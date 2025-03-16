public class Student{
	private String name;
	private int age;
	private Grade[] g1;

	public Student(String name, int age, Grade[] g1){
		this.name = name;
		this.age = age;
		this.g1 = g1;
	}
	public String getName(){
		return name;
	}
	public int getAge(){
		return age;
	}
	public Grade[] getG1(){
		return g1;
	}
	public void displaySubjects(){
		for(int i= 0; i<g1.length;i++){
			System.out.println(g1[i].getSubject()+" : "+g1[i].getMarks());
		}
	}
}