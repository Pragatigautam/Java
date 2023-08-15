package Revisions;

public class SingletonPt2 {

	public static void main(String[] args) {
		

	}

}
class Database2{
	private static Database2 DB;
	
	private Database2() {
		
	}
	
	public static Database2 getInstance() {
		if (DB==null) {
			DB = new Database2();
		}
		return DB;
	}
}
