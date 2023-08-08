package two;

public class SingletonPrac1 {

	public static void main(String[] args) {
		DataBase1 Db=DataBase1.getInstance();
		Db.getConnection();
		
		

	}

}
class DataBase1{
	public static DataBase1 dbObj;
	
	private DataBase1() {
		
	}
	
	public static DataBase1 getInstance(){
		if (dbObj == null) {
			dbObj = new DataBase1();
				
			
			
		}
		return dbObj;
		
		
	}
	public void getConnection() {
		System.out.println("You are connected to the database");
	}
}
