package two;

public class RevisionConstructor {

	public static void main(String[] args) {
		
		//object without constructor
		Book SHOEH = new Book();
		SHOEH.name = "Seven Husband Of Evelyne Hugo";
		System.out.println(SHOEH.name);
		
		SHOEH.pages= 400;
		System.out.println(SHOEH.pages);
		
		
		
		//object for constructor
		
		Games BB = new Games("BasketBall", 3);
		
		
		BB.displayyName();
		
		Games TT = new Games ("Table Tenis", 4);
		TT.displayyName();
		
		
		

	}

}

//creating class for without constructor

class Book{
int pages;
String name;

public void displayName(){
	System.out.println(this.name);
	
}
}

//creating class with constructor 

class Games {
	String GameName;
	int time;
	
	public Games(String GN, int GT) {
		this.GameName=GN;
		this.time=GT;
		
	}
	public void displayyName() {
		System.out.println(this.GameName);
	}
	
	
}
