package Revisions;

public class SingletonTime1 {

	public static void main(String[] args) {
		Databasesss obj;
		obj = Databasesss.getInstance();
		obj.getMessage();
		

	}

}

class Databasesss{
	
	//creating instance of Databasesss
	//static to call something on class level
	private static Databasesss DB;
	
	//private constructor
	private Databasesss() {
		
	}
	
	//method returning Databasesss datatype
	public static Databasesss getInstance() {
		if (DB==null) {
			DB = new Databasesss();
		}
		return DB;
	}
	
	public void getMessage() {
		System.out.println("Database is connected.");
		
	}
}
