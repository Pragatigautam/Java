
public class secondExam {

	public static void main(String[] args) {
		
		
		
		
		

		
		
		//program 2 reverse of the string
		String name = "Potato";
		String reverseP= "";

		for( int i  = 0; i < name.length(); i ++)

		{   
		 reverseP = name.charAt(i) + reverseP; 
		 
		}   
		System.out.println(reverseP);
		
		
		//program 3 multidimentional array for int and for each loop
		
		int [][] number= {
				{321,542,33},
				{42,54,65},
				{17,84,99}
		};
		
		for(int [] num1:number) {
			for(int num2 : num1) {
				System.out.println(num2);
			}
		}
		
		
		//program 4 define a string array and loop using while loop
		 String [] students = {"ram", "sita", "gita", "shyam", "sarita"};
		 int l=0;
		 while (l<students.length) {
			 System.out.println(students[l]);
			 l++;
		 }
		 
		 //program 5 define a class vehicle with 2 properties and one method
		 vehicle toyota = new vehicle ("black", 't');
		 System.out.println(toyota.color);
		 System.out.println(toyota.type);
		 
		 toyota.start();
		//creating function for program 1
		
		 
		 
		

		
	}
	
	
}

class vehicle{
	String color;
	char type;
	public vehicle(String cl, char ty) {
		this.color=cl;
		this.type=ty;
}
	public void start()
	{
		System.out.println("toyota gets started");
	}
	
}






