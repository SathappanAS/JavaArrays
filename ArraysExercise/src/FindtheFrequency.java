
public class FindtheFrequency {

	public static void main(String[] args) {
		
		int []v= {1,2,1,1,1,1,2};
		
		int count =0;
		
		for(int i=0;i<v.length;i++) {
			if(v[i]==1) {
				count++;
			}
			
		}
		System.out.println(count);

	}

}
