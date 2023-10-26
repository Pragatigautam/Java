package Revisions;

public class Singleton04 {

	public static void main(String[] args) {
		
		Database03 Ref;
		Ref = Database03.getInstance();
		Ref.getMessage();
		

	}

}

class Database03{
	
	
	private static Database03 DB;
	
	private Database03() {
		
	}
	
	public static Database03 getInstance() {
		if(DB==null) {
			DB=new Database03();
		}
		return DB;
	}
	
	public void getMessage() {
		System.out.println("Database is connected.");
	}
	
}
