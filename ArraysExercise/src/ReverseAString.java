import java.util.Arrays;

public class ReverseAString {

	public static void main(String[] args) {
		
		String str ="Geeks";
		
		char [] s = str.toCharArray();
		
		System.out.println(Arrays.toString(s));
		System.out.println(s.length);
		int len = s.length; //5
		/*char with new array*/
//		char temp[]=new char[len];
//		int j=0;
//		for( int i=len-1;i>=0;i--) {
//	
//			temp[j]=s[i];
//			j++;
//		}
//		System.out.println(Arrays.toString(temp));
		
		
		/*Reverse an array with same char*/
		char a=' ';
	
		for(int i=0,j=len-1;i<len/2 && j>=len/2;i++,j--) {
			
			a=s[i];
			s[i]=s[j];
			s[j]=a;
		
		}
		
		
		System.out.println(Arrays.toString(s));
		
	}

}