
public class UnionandIntersection {

	public static void main(String[] args) {
		
		int []a= {85,25,1,32,56,6};
		int []b= {85,2};
		
		int count = a.length;
		
		for(int i=0;i<b.length;i++) {
			boolean IsFlag=false;
			for(int j=0;j<a.length;j++) {
				if(b[i]==a[j]) {
					IsFlag=true;
					//break;
				}
			}
			if(IsFlag!=true) {
				count++;
			}
		}
		System.out.println(count);

	}

}