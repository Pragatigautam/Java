package two;

public class Arrrrrrr {

	public static void main(String[] args) {
		int [][]A = {
				{111,222,333},
				{444,555,666},
				{777,888,999}
		};
		
		for (int i=0; i<A.length; i++) {
			int []B=A[i];
			for (int j=0; j<B.length; j++) {
				System.out.println(B[j]);
			}
		}
		
		//while loop
		int i1=0;
		while (i1< A.length) {
			int C[]= A[i1];
			int j1=0;
			while (j1<C.length) {
				System.out.println(C[j1]);
				j1++;
			}
			
			i1++;
		}
		
		for (int [] D:A) {
			for (int E:D) {
				System.out.println(E);
			}
		}
		
		

	}

}
