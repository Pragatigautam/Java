import java.util.Arrays;

public class multidimensionalArrayss {

	public static void main(String[] args) {
		int [][] marks3 = new int [3][4];
		marks3 [0] [0] = 1;
		marks3 [0] [1] = 2;
		marks3 [0] [2] = 3;
		marks3 [0] [3] = 4;
		
		marks3 [1] [0] = 100;
		marks3 [1] [1] = 200;
		marks3 [1] [2] = 300;
		marks3 [1] [3] = 400;
		
		marks3 [2] [0] = 111;
		marks3 [2] [1] = 222;
		marks3 [2] [2] = 333;
		marks3 [2] [3] = 444;
		
		System.out.println(marks3[2][3]);
		
		//for loop
		
		for (int i =0; i<marks3.length; i++) {
			int [] arr = marks3[i] ;
			for (int j=0; j<arr.length; j++) {
				System.out.println(arr[j]);
			}
		
		}
		
		//while loop
		
		int [][] marks4 = {
			    { 11, 22, 33 },
				{ 44, 55, 66 }, 
				{ 77, 88, 99 } 
		};
		
		int i1= 0;
		while (i1<marks4.length) {
			int arr [] = marks4[i1];
			int i2 = 0;
			while (i2<arr.length) {
				System.out.println(arr[i2]);
				i2++;
			}
			i1++;
		}
		
		//for each loop
		

		for(int [] row:marks4) {
			for(int column : row) {
				System.out.println(column);
			}
		}
		
		//print in array form
		
		
		int [] poo= {1,2,5};
		for (int i3=0; i3<poo.length; i3++) {
			//System.out.println(poo[i3]);
		}
		System.out.println(Arrays.toString(poo));
		
		
		int [][] pooo= {
				{ 11, 22, 33 },
				{ 44, 55, 66 }, 
				{ 77, 88, 99 } 
		};
		for (int m=0; m<pooo.length; m++) {
		int []arrayyy = pooo[m];
		for (int k=0; k<poo.length; k++) {
			System.out.println(arrayyy[k]);
		}
		}
		
		
		
		

	}

}
