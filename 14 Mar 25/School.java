public class School{
	private String name;
	private Student[] s1;

	public School(String name, Student[] s1){
		this.name = name;
		this.s1 = s1;
	} 
	public void display(){
		System.out.println("School: "+name);
	for(int i = 0;i<s1.length;i++){
		System.out.println("Student: "+s1[i].getName()+" Age: "+s1[i].getAge());
		System.out.println("Subjects and Marks:");
		
		s1[i].displaySubjects();
	}
	}
}