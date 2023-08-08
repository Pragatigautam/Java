package two;

interface Course{
	public void firstCourse();
	public void secondCourse();
	public void thirdourse();
	public void fourthCourse();
	public void fifthCourse();
}
public class MapDay1 {

	public static void main(String[] args) {
		Course Firm;
		Firm = new Zorba();
		Firm.firstCourse();
		
		Firm = new Pragati();
		Firm.fifthCourse();
	}
		
		

	

}
class Zorba implements Course{

	
	public void firstCourse() {
		
	System.out.println("This is first Zorba Method");	
	}


	public void secondCourse() {
	System.out.println("This is second Zorba Method");	
		
	}

	
	public void thirdourse() {
	System.out.println("This is third Zorba Method");	
		
	}

	
	public void fourthCourse() {
	System.out.println("This is fourth Zorba Method");
		
		
	}

	
	public void fifthCourse() {
	System.out.println("This is fifth Zorba Method");	
		
	}
	
}
class Pragati implements Course{

	
	public void firstCourse() {
		
	System.out.println("This is first Pragati Method");	
	}


	public void secondCourse() {
	System.out.println("This is second Pragati Method");	
		
	}

	
	public void thirdourse() {
	System.out.println("This is third Pragati Method");	
		
	}

	
	public void fourthCourse() {
	System.out.println("This is fourth Pragati Method");
		
		
	}

	
	public void fifthCourse() {
	System.out.println("This is fifth Pragati Method");	
		
	}
	
}


