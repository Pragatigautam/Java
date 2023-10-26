package Revisions;

public class Singleton05 {

	public static void main(String[] args) {
		
		Database04 Ref;
		Ref = Database04.getInstance();
		Ref.getMessage();
		

	}

}

class Database04{
	
	private static Database04 DB;
	
	private Database04() {
		
	}
	
	public static Database04 getInstance() {
		if (DB==null) {
			DB = new Database04();
		}
		
		return DB;
	}
	
	public void getMessage() {
		System.out.println("Database has been connected.");
	}
}

