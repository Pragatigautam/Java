package two;
interface Subject{
	public void subject1();
	public void subject2();
	public void subject3();
}

public class Aug20Exam6 {

	public static void main(String[] args) {
		Subject Islington;
		
		Islington = new College1();
		Islington.subject1();
		Islington.subject2();
		Islington.subject3();
		
	
	

	}

}
class College1 implements Subject{

	@Override
	public void subject1() {
		System.out.println("Maths");
		
	}

	@Override
	public void subject2() {
		System.out.println("Science");
		
	}

	@Override
	public void subject3() {
		System.out.println("Computer science");
		
	}
	
}
