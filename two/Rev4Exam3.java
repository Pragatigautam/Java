package two;

public class Rev4Exam3 {

	public static void main(String[] args) {
		//print character of string using for loop
		
		String Name= "Pragati";
		for (int i=0; i<Name.length(); i++) {
			System.out.println(Name.charAt(i));
		}
		
		//while loop
		int j=0;
		while(j<Name.length()) {
			System.out.println(Name.charAt(j));
			j++;
		}
		
		
		//for each loop
		for (char NewName  : Name.toCharArray()) {
			System.out.println(NewName);
		}
		
		//for each loop
		
		String BB = "BiggBoss";
		
		for (char NBB:BB.toCharArray()) {
			System.out.println(NBB);
		}
		
		
		//reverse string "pragati
		
		
		String Nm = "pragati";
		String rev = "";
		for (int i4=0; i4<Nm.length(); i4++) {
			rev = Nm.charAt(i4) +rev ;
			
			
		}
		System.out.println(rev);

	}

}
