package Revisions;

public class SingletonTime2 {

	public static void main(String[] args) {
		
		Database00 obj;
		obj = Database00.getInstance();
		obj.getMessage();
		

	}

}

class Database00{
	
	//creating instance of Database0 class
	private static Database00 DB;
	
	//private constructor
	private Database00() {
		
	}
	
	public static Database00 getInstance() {
		if(DB==null) {
			DB=new Database00();
		}
		return DB;
	}
	
	public void getMessage() {
		System.out.println("Database connected.");
	}
}
