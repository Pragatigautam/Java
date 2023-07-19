package two;

public class Rev4Exam5 {

	public static void main(String[] args) {
		int [][]Number = {
				{12,34,43},
				{132,65,76},
				{983,9823, 287}
		};
		
		for (int i=0; i<Number.length; i++) {
			int [] NewNumber = Number[i];
			for (int j=0; j<NewNumber.length;  j++) {
			System.out.println(NewNumber[j]);
			}
		

	}
		
		
		int i1= 0;
		while (i1<Number.length) {
			int [] NewwNumber = Number[i1];
			int j1=0;
			while (j1<NewwNumber.length) {
				System.out.println(NewwNumber[j1]);
				j1++;
			}
			i1++;
		}
		
		for (int []NewwwNumber:Number) {
			for (int NewsNumber:NewwwNumber) {
				System.out.println(NewsNumber);
			}
			
		}
		
		//reverse of string 
		
		String Name = "Prajwol";
		String RevP = "";
		for (int i2=0; i2<Name.length(); i2++) {
			RevP = Name.charAt(i2) + RevP;
			
					
			
			
		}
		System.out.println(RevP);
		

}
}
