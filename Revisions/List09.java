package Revisions;

import java.util.Arrays;
import java.util.List;

public class List09 {

	public static void main(String[] args) {
		List<String> Animals = Arrays.asList("Ant", "Bear", "", "Cat", "", "Dog");
		System.out.println(Animals.stream().filter(a->a.isEmpty()).count());
		
		List<String> Birds = Arrays.asList("Bird1", "Bird2", "Bird3", "Bird4");
		System.out.println(Birds.stream().map(b->b.toUpperCase()).toList());
		
		

	}

}
