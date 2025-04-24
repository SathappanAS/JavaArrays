import java.util.Arrays;

public class MinMaxArray {

	public static void main(String[] args) {
	
		int a[] = { 3,2,-1,56,1000,167 };
		int min = a[0];
		int max = a[0];
		
		int len = a.length;
		System.out.println("Lenght of an array = " + len);
		System.out.println("Li = " + a[0]);
		System.out.println("Hi = " + a[len - 1]);
		System.out.println(Arrays.toString(a));
		
		for(int i=1;i<len;i++) {
			if(min>a[i]) {
				min=a[i];
			}
			if(max<a[i]) {
				max=a[i];
			}
		}
		
		System.out.println(min);
		System.out.println(max);

	}

}
