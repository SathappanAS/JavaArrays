
public class SortArrayDescending {

	public static void main(String[] args) {
		
		int array[] = {5,3,8,6,2,7};
		
		int temp;
		
		
		//Loop through the array
		
		for(int i=0;i<array.length;i++) {
			for(int j=i+1;j<array.length;j++) {
				//Compare elements
				if(array[i]<array[j]) {
					//swap elements if necessary
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		
		//Print sorted array
		System.out.println("Array sorted in descending order:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+ " ");
		}
		
	}

}
