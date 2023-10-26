package Revisions;

public class SingletonRevs {

	public static void main(String[] args) {
		DatabaseG Ref;
		Ref= DatabaseG.getInstance();
		Ref.getMessage();
		

	}

}

class DatabaseG{
	private static DatabaseG DB;
	
	private DatabaseG() {
		
	}
	
	public static DatabaseG getInstance() {
		if(DB==null) {
			DB=new DatabaseG();
		}
		return DB;
	}
	public void getMessage() {
		System.out.println("Database Connected.");
	}
	
}
