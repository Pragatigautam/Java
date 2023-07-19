
public class InheritPT8273 {

	public static void main(String[] args) {
		
		
		Professor prags =  new Professor("Maths");
		
		prags.displaySubjects();
		
		
		prags.abc();
	
		

	}

}

class TeacherE {
	
	protected String subject;
	
	public TeacherE(String sub){
		this.subject = sub;
	}
	
	public void abc() {
		System.out.println(" this is teacher");
	}
	
}

class Professor  extends TeacherE{

	String subject = "chemistry";
	public Professor(String sub) {
		super(sub);
		
	}
	
	public void displaySubjects() {
		System.out.println(this.subject);
		System.out.println(super.subject);
	}
	public void abc() {
		System.out.println("this is professor");
		super.abc();
	}
	
	
	
}
