package two;

public class July23Program1 {

	public static void main(String[] args) {
		Society S = new Society("Irving");
		System.out.println(S.Location);
		S.DisplayLocation();
		
		
		House H = new House("Irving", 12);
		System.out.println(H.Location);
		System.out.println(H.HouseNumber);
		H.DisplayColor();
		H.DisplayLocation();
		
		
		Room R = new Room("Irving", 12, 5);
		System.out.println(R.Location);
		System.out.println(R.HouseNumber);
		System.out.println(R.NumberOfRooms);
		R.DisplayLocation();
		R.DisplayColor();
		R.DisplayRoomSize();
		
		
		

		
		

	}

}
class Society{
	String Location;
	public Society(String LC) {
		this.Location = LC;
	}
	
	public void DisplayLocation() {
		System.out.println(this.Location);
	}
	
	
}

class House extends Society{
	int HouseNumber;
	public House(String LC, int HN) {
		super(LC);
		this.HouseNumber = HN; 
		
	}
	public void DisplayColor() {
		System.out.println("The color of the house is Brown");
	}

	

		
		
	}

class Room extends House{
	int NumberOfRooms;

	public Room(String LC, int HN, int NR) {
		super(LC, HN);
		this.NumberOfRooms = NR;
		
	}
	
	public void DisplayRoomSize() {
		System.out.println("The room sizes are big.");
	}
	
}

