public class array1{
	public static void main(String args[]){
		int[] m1 = {78, 45,98,86,98,78, 45,98, 86};
	/*
		int sum = 0;
		for(int i =0; i<m1.length;i++){
			sum += m1[i];
	}
		double avg = sum/m1.length;
*/

		for(int j = 0;j<m1.length;j++){
			for(int z = 0;z<m1.length-1;z++){
				if(m1[z]>m1[z+1]){
					int temp = m1[z];
					m1[z] = m1[z+1];
					m1[z+1] = temp;
			}
		}
	}

		//System.out.println("Average: "+avg);
		for(int x = 0; x<m1.length;x++){

			System.out.println(m1[x]);
		}
		double med =0;
		if(m1.length%2 == 0){
			med = (m1[m1.length/2] + m1[(m1.length/2)+1])/2;
		}
		else{
			med = m1[m1.length/2];
		}
		System.out.println("Median: "+med);
		int count1 = 0;
		int temp = 0;
		for(int i = 0;i<m1.length;i++){
			int count = 0;
			for(int j = 0;j<m1.length;j++){
				if(i == j){
					continue;
			}
				if(m1[j] == m1[i]){
					count++;
					temp = m1[i];
			}
				count1 = count;
		}
			if(count>count1){
				count1 = count;
				temp = m1[i];
			}
	}
		count1 += 1;
		System.out.println("Mode: "+temp+" Times: "+count1);

	}
}