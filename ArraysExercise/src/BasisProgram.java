//copy an array

import java.util.Arrays;

public class BasisProgram {

	public static void main(String[] args) {

		int a[] = { 10,0, 11, 12, 13, 14, 0, 0, 0, 0, 0 };
		int len = a.length;
		System.out.println("Lenght of an array = " + len);
		System.out.println("Li = " + a[0]);
		System.out.println("Hi = " + a[len - 1]);
		System.out.println(Arrays.toString(a));

		// Step 1: Count non-zero elements
		int count = 0;
		for (int i=0;i<len;i++) {
			if (a[i] != 0) {
				count++;
			}
		}

		// Step 2: Create new array and copy non-zero elements
		int[] result = new int[count];
		int j = 0;
		for (int i=0;i<len;i++) {
			if (a[i] != 0) {
				result[j]=a[i];
				j++;
			}
		}

		// Print the result
		System.out.println("Array after removing zeros: " + Arrays.toString(result));
	}
}