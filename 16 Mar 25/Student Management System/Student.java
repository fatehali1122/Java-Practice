public class Student{
	private String name;
	private Grade[] grade;
	
	public Student(String name, Grade[] grade){
		this.name = name;
		this.grade = grade;
	}
	public Student(Student other){
		this.name = other.name;
		this.grade = new Grade[other.grade.length]; // Initialize array
		for (int i = 0; i < other.grade.length; i++) {
    			this.grade[i] = new Grade(other.grade[i]); // Copy each Grade object
}
	}

	public void display(){
		System.out.println("Student Name:"+name);

		for(int i = 0;i<grade.length;i++){
			System.out.println(grade[i].getSubject()+":"+grade[i].getMarks());
		}
	}
	
}