public class Grade{
	private String subjectName;
	private int marks;
	
	public Grade(String subjectName, int marks){
		this.subjectName = subjectName;
		this.marks = marks;
	}
	public String getSubject(){
		return subjectName;
	}
	public int getMarks(){
		return marks;
	}

}