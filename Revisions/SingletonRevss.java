package Revisions;

public class SingletonRevss {

	public static void main(String[] args) {
		Datab obj;
		obj = Datab.getInstance();
		obj.getMessage();
		

	}

}
class Datab{
	private static Datab DB;
	private Datab() {
		
	}
	
	public static Datab getInstance() {
		if(DB==null) {
			DB=new Datab();
		}
		return DB;
	}
	public void getMessage() {
		System.out.println("Database is connected.");
	}
}
