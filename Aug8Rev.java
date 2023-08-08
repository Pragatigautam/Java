import java.util.ArrayList;

public class Aug8Rev {

	public static void main(String[] args) {
		
		//define Array list
		ArrayList<String> Colors = new ArrayList<>();
		Colors.add("Pink");
		Colors.add("Red");
		Colors.add("Blue");
		Colors.add("Yellow");
		Colors.add("Black");
		Colors.add("White");
		System.out.println(Colors);
		
		//Retrieve value
		String a = Colors.get(0);
		System.out.println(a);
		
		String b = Colors.get(4);
		System.out.println(b);
		
		String c = Colors.get(3);
		System.out.println(c);
		
		//Update Value
		Colors.add("Purple");
		System.out.println(Colors);
		
		//replace (in 0 index) using .set method
		Colors.set(0, "Peach");
		
		
		//Delete
		Colors.remove("Black");
		Colors.remove(1);
		System.out.println(Colors);
		
		
		

	}

}
