import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamsForRestPt2 {

	public static void main(String[] args) {
		List<Person> people = new ArrayList<>();
		people.add(new Person("Pragati", "Adhikari", 23));
		people.add(new Person("Biplov", "Adhikari", 45));
		people.add(new Person("Prajwol", "Gautam", 55));
		people.add(new Person("Bipisha", "Adhikari", 20));
		people.add(new Person("Sophiya", "Gautam", 35));
		people.add(new Person("Pradeep", "Gautam", 49));
		people.add(new Person("Vidya", "Gautam", 16));
		people.add(new Person("Binod", "Adhikari", 18));
		people.add(new Person("Punam", "Adhikari", 22));
		people.add(new Person("simba", "Adhikari", 2));
		people.add(new Person("simba", "Adhikari", 2));
		people.add(new Person("simba", "Adhikari", 3));

		// age above 30
		List<Person> ageAbove30 = people.stream().filter(a -> a.getAge() > 30).collect(Collectors.toList());
		ageAbove30.forEach(a -> System.out.println(a.displayName()));

		// filter based on names
		List<Person> sameNames = people.stream().filter(b -> b.displayName().contains("simba"))
				.collect(Collectors.toList());
		sameNames.forEach(b -> System.out.println(b.displayName()));

		// collecting only names
		List<String> names = people.stream().map(c -> c.firstName).collect(Collectors.toList());
		names.forEach(c -> System.out.println(c));

		// average age of everyone
		List<Integer> allAge = people.stream().map(d -> d.getAge()).collect(Collectors.toList());
		int sum = allAge.stream().reduce(0, (x, y) -> x + y);
		System.out.println(sum / people.size());

		// sorting in accending order by age
		List<Person> sortedByAge = people.stream().sorted(Comparator.comparingInt(Person::getAge))
				.collect(Collectors.toList());

		sortedByAge.forEach(person -> System.out.println(person.displayName()));

		// count the number of people with same age
		Map<Integer, Long> ageCountMap = people.stream()
				.collect(Collectors.groupingBy(Person::getAge, Collectors.counting()));

		ageCountMap.forEach((age, count) -> {
			if (count > 1) {
				System.out.println("Age " + age + ": " + count + " people");
			}
		});

		// name of first 3 people where age > 30
		List<Person> firstThreeAbove30 = people.stream().filter(person -> person.getAge() > 30).limit(3)
				.collect(Collectors.toList());

		firstThreeAbove30.forEach(person -> System.out.println(person.displayName()));

		// distinct name list
		List<String> distinctNames = people.stream()
		        .map(person -> person.firstName)
		        .distinct()
		        .collect(Collectors.toList());

		distinctNames.forEach(name -> System.out.println(name));


	}

}

class Person {
	String firstName;
	String lastName;
	int age;

	public Person(String fn, String ln, int ag) {
		this.firstName = fn;
		this.lastName = ln;
		this.age = ag;
	}

	public String displayName() {
		return (this.firstName + this.lastName);

	}

	public int getAge() {
		return (this.age);
	}
}
