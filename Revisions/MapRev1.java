package Revisions;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class MapRev1 {

	public static void main(String[] args) {
		List<String> Animals = Arrays.asList("Lion", "Tiger", "", "Bear","Fox", "");
		System.out.println(Animals.stream().filter(a->a.isEmpty()).count());
		
		List<String>Fruits = Arrays.asList("Apple", "Banana", "Kiwi", "", "", "", "Papaya", "");
		System.out.println(Fruits.stream().filter(b->b.isEmpty()).toList());

	}

}
