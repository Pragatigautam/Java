import java.util.List;
import java.util.stream.Collectors;

public class Aug8Class {

	public static void main(String[] args) {
		
		List<Person9> P = List.of(
				new Person9("Pragati Gautam", 23, "Irving"),
				new Person9("Sophiya Gautam", 20, "Kathmandu"),
				new Person9("Sarthak Gautam", 17, "Nepal"),
				new Person9("Prajwol Gautam", 28, "Texas")
				
				);
		
		List<Person9> above22Age = P.stream().filter(person -> person.DisplayAge() > 22)
				.collect(Collectors.toList());

		System.out.println(above22Age);

		for (int i = 0; i < above22Age.size(); i++) {
			System.out.println(above22Age.get(i).DisplayAge());
			System.out.println(above22Age.get(i).DisplayCity());
			System.out.println(above22Age.get(i).DisplayName());
		}

		
		

		List<String> names = P.stream().map(person -> person.DisplayName()).collect(Collectors.toList());
		
		for(String nm:names) {
			System.out.println(nm);
		}
		
		
		List<String> NameAndCity = P.stream().map(person -> person.DisplayName().concat(" =")
							.concat(person.DisplayCity())).collect(Collectors.toList());
		
		
		for(String NMCT:NameAndCity) {
			System.out.println(NMCT);
		}
		
		
	

	}

}
class Person9{
	private String Name;
	private int Age;
	private String City;
	
	public Person9(String Nm, int Ag, String Ct) {
	this.Name = Nm;
	this.Age = Ag;
	this.City = Ct;
	}
	
	public String DisplayName() {
	return Name;	
	}
	
	public String DisplayCity() {
		return City;	
		}
	
	public int DisplayAge() {
		return Age;	
		}
}
