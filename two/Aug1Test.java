package two;

public class Aug1Test {

	public static void main(String[] args) {
		NewDataBase ObjNDB;
		ObjNDB = NewDataBase.getInstance();
		ObjNDB.getConnect();
		

	}

}
class NewDataBase{
	private static NewDataBase NDB;
	
	private NewDataBase() {
		
	}
	
	public static NewDataBase getInstance() {
		if (NDB==null) {
			NDB= new NewDataBase();
			
		}
		return NDB;
	}
	public static void getConnect() {
		System.out.println("This is connection method");
	}
	
		
	
}
