package Revisions;

public class Singletonpt3 {

	public static void main(String[] args) {
		
		Database02 Ref;
		Ref = Database02.getInstance();
		Ref.getMessage();
		

	}

}
class Database02{
	
	private static Database02 DB;
	
	private Database02() {
		
	}
	
	public static Database02 getInstance() {
		if(DB==null) {
			DB = new Database02();
			
		}
		return DB;
		
	}
	
	public void getMessage() {
		System.out.println("Database is connected.");
	}
}
