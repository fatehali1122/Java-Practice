public class array{
	public static void main(String args[]){
		String[] names = new String[5];
		
		names[0] = "Fateh";
		names[1] = "Fateh";
		names[2] = "Fateh";
		names[3] = "Fateh";
		names[4] = "Fateh";

		for(int i = 0; i<names.length;i++){
			System.out.println("Student "+(i+1)+":"+names[i]);
		}

	}
}