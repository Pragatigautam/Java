package Revisions;

public class RevOfSingleton {

	public static void main(String[] args) {
	
		DBMS obj;
		obj = DBMS.getInstance();
		obj.getConnect();

	}

}
class DBMS{
	private static DBMS DB;
	
	private DBMS() {
		
	}
	public static DBMS getInstance() {
		if (DB == null) {
			DB = new DBMS();
		}
		return DB;
		
	}
	
	public void getConnect() {
		System.out.println("This is connection");
	}
}
