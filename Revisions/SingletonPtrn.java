package Revisions;

public class SingletonPtrn {

	public static void main(String[] args) {
		DBMS09 Ref;
		Ref = DBMS09.getInstance();
		Ref.getMessage();
		

	}

}
class DBMS09{
	private static DBMS09 DB;
	private DBMS09() {
		
	}
	
	public static DBMS09 getInstance() {
		if(DB==null) {
			DB = new DBMS09();
		}
		return DB;
	}
	public void getMessage() {
		System.out.println("Database is connected.");
	}
}
