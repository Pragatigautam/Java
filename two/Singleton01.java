package two;

public class Singleton01 {

	public static void main(String[] args) {
		Database obj;
		obj=Database.getinstance();
		obj.getconnect();
	}
}

//SINGLETON IS IMPORTANT FOR INTERVIEW

//IT IS USED WHEN YOU WANT TO ESTABLISH A CONNECTION BETWEEN DATABASE

//YOU CANNOT CREATE MULTIPLE CONNECTION TO THE DATABASE BECAUSE IT WILL BREAK DATABASE
//THAT'S WHY IT'S SINGLE TIME THING
//THAT'S WHY WE CREATE ONLY ONE REFERENCE VERIABLE





class Database{
	//properties with object
	//Static is used to call something on the class level
	private static Database DB;
	
	//default construction (not needed here but still i created to understand)
	private Database() {
		
	}
	//method with return type
	public static Database getinstance() {
		if(DB==null) {
			DB=new Database();
		}
		return DB;
			
	}
	
	//without return type doesn't work without (with return type)
	//method without return type
	public void getconnect() {
		System.out.println("This is connection");
	}
	
	
}
