package two;

public class Aug20Exam2 {

	public static void main(String[] args) {
		DatabaseV Ref;
		Ref = DatabaseV.getInstance();
		Ref.getMessage();
		
		

	}

}
class DatabaseV{
	private static DatabaseV DB;
	
	private DatabaseV() {
		
	}
	
	public static DatabaseV getInstance() {
		if (DB==null) {
			DB = new DatabaseV();
		}
		return DB;
	}
	public void getMessage() {
		System.out.println("Database is connected.");
	}
	
	
}
