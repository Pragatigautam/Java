import java.util.ArrayList;

public class Aug8Rev2 {

	public static void main(String[] args) {
		ShoppingCenter MusicCity = new ShoppingCenter(12345,"Music City","Lewisville");
		ShoppingCenter IrvingMall = new ShoppingCenter (34543,"Irving Mall","Irving");
		ShoppingCenter HulenMall = new ShoppingCenter (80823, "Hulan Mall","South Fort Worth");
		
		
		//Creating an arrayList named Mall with data type ShoppingCenter 
		ArrayList<ShoppingCenter> Mall = new ArrayList<>();
		
		//adding objects of ShoppingCenter in Mall array list
		Mall.add(MusicCity);
		Mall.add(IrvingMall);
		Mall.add(HulenMall);
		
		Mall.get(0).getLocation();
		
		
		//looping over each properties and method
		for(int i=0; i<Mall.size(); i++) {
			System.out.println(Mall.get(i).Name);
			System.out.println(Mall.get(i).Number);
			System.out.println(Mall.get(i).Location);
			Mall.get(i).getLocation();
		}
			
			//using while loop
			int i1=0;
			while (i1<Mall.size()) {
				System.out.println(Mall.get(i1).Name);
				System.out.println(Mall.get(i1).Number);
				System.out.println(Mall.get(i1).Location);
				Mall.get(i1).getLocation();
				i1++;
			}
			
			//for each
			for(ShoppingCenter a:Mall) {
				System.out.println(a.Name);
				System.out.println(a.Number);
				System.out.println(a.Location);
				a.getLocation();
			}
			
			
			
			
				
			
		
		
		

	}

}
class ShoppingCenter {
	int Number;
	String Name;
	String Location;
	
	public ShoppingCenter(int N, String Nm, String L) {
		this.Number=N;
		this.Name=Nm;
		this.Location = L;
	}
	public void getLocation() {
		System.out.println(this.Location);
	}
}
