package Revisions;

public class two {

	public static void main(String[] args) {
		int A[][]= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		for(int i=0; i<A.length; i++) {
			int B[]= A[i];
			for(int j=0; j<B.length; j++) {
				System.out.println(B[j]);
			}
		}
		
		int i=0;
		while(i<A.length) {
			int B[]= A[i];
			i++;
			int j=0;
			while (j<B.length) {
			System.out.println(B[j]);	
			j++;
			}
		}
	
		for(int B[]: A) {
			for(int C:B) {
				System.out.println(C);
			}
		}
	

	}

}
