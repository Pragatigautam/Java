package two;

public class RevisionMultiArray {

	public static void main(String[] args) {
		int [][] num = {
				{1,2,3},
				{4,5,6},
				{7,8,9}
				
		};
		
		for (int i=0; i<num.length; i++) {
		int [] arr = num[i];
		for (int j =0; j<arr.length; j++) {
			System.out.println(arr[j]);
		}
		}
		
		//same another one
		//for loop
		int [][] number = {
				{12,34,54},
				{98,76,65},
				{26,18,99}
		};
		
		for(int i1=0; i1<number.length; i1++) {
			int []Arr2 = number[i1] ;
			for(int i2=0; i2<Arr2.length; i2++) {
				System.out.println(Arr2[i2]);
			}
		}
		
		//using while loop
		int [][] numb = {
				{11,12,13},
				{14,15,16},
				{17,18,19}
		};
		
		int i3=0;
		while (i3<numb.length) {
			int [] numb2 = numb[i3] ;
			int i4=0;
			while (i4<numb2.length) {
			System.out.println(numb2[i4]);	
			i4++;
			}
			i3++;
			
		}
		
		//for each
		int [][] AnNumb = {
				{111,222,333},
				{444,555,666},
				{777,888,999}
		};
		
		for (int [] NAN:AnNumb) {
		for(int naya:NAN) {
			System.out.println(naya);
		}
		}
		
		

		
		
		
		
		
		
		

	}

}
