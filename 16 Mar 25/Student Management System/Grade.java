public class Grade{
	private String subject;	
	private int marks;

	public Grade(String subject, int marks){
		this.subject = subject;
		this.marks = marks;
	}
	public Grade(Grade other){
		this.subject = other.subject;
		this.marks = other.marks;
	}

	
	public String getSubject(){
		return subject;
	}
	public int getMarks(){
		return marks;
	}

}