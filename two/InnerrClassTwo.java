package two;

public class InnerrClassTwo {

	public static void main(String[] args) {
		
		College Islington = new College(10000,"Irving, TX" );
		System.out.println(Islington.Location);
		System.out.println(Islington.NumOfStd);
		Islington.DisplayLocation();
		
		College.MainBuilding BuildingA = Islington.new MainBuilding(15);
		//Syntax: OuterClass InnerClass Obj = Outer Obj .new Innerclass
		

	}
}


class College{
	int NumOfStd;
	String Location;
	public College(int NOS, String LC) {
		this.NumOfStd = NOS;
		this.Location = LC;
	}
		
		
		
		
		class MainBuilding{
			int NumOfRooms;
			public MainBuilding(int NOR) {
				this.NumOfRooms = NOR;
			}
			public void DisplayTotalRooms() {
				System.out.println("There are total 15 rooms in main building");
			}
		}
		
		
	
	public void DisplayLocation() {
		System.out.println("This college is located in Irving, TX.");
	}
	
}

