package two;

public class ExceptionHandling3 {

	public static void main(String[] args) {
		int []Arr1 = {12,14,15,16};
		try {
			System.out.println(Arr1[0]);
			System.out.println(Arr1[7]);
			
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
			
			
			
		}

	}

}
