
public class ArrayPrac1 {

	public static void main(String[] args) {
		int num [][] ={
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		
		//for loop
		for (int i=0; i<num.length; i++) {
			int []num1 = num[i];
			for (int j=0; j<num1.length; j++) {
				System.out.println(num1[j]);
			}
		}
		
		
		//while loop
		int j=0;
		while (j<num.length) {
			System.out.println();
		}

	}

}
