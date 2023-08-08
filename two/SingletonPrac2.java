package two;

public class SingletonPrac2 {

	public static void main(String[] args) {
		
		Database2 db = Database2.getInstance();
		db.getConnect();
		

	}

}
class Database2{
	public static Database2 ReferenceObj;
	private Database2(){
		
	}
	
	public static Database2 getInstance() {
		if (ReferenceObj == null) {
			ReferenceObj = new Database2();
		}
				return ReferenceObj; 
			
				
			
		
	} 
	public void getConnect() {
		System.out.println("You are connected to the database.");
	}
		
	
	
}
