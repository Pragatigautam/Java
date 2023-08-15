package Revisions;

public class singleee {

	public static void main(String[] args) {
		
		Database0 obj;
		obj = Database0.getInstance();
		obj.getConnect();
		

	}

}
class Database0{
	
	private static Database0 DB;
	
	private Database0() {
		
	}
	
	
	public static Database0 getInstance() {
		if (DB==null) {
			
			DB = new Database0();
		}
		return DB;
	}
	public void getConnect() {
		System.out.println("This is connection");
	}

}
