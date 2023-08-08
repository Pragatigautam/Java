import java.util.Arrays;
import java.util.List;

public class Aug8Rev7 {

	public static void main(String[] args) {
	
	List<String> Fruits = Arrays.asList("Apple", "Banana","", "Papaya","Avocado", "");
	System.out.println(Fruits.stream().filter(a->a.isEmpty()).count());
	
	List<String>Animals = Arrays.asList("Ant", "", "Bear", "Cat","", "Dog", "Elephant");
	System.out.println(Animals.stream().filter(b->!b.isEmpty()).count());
	
	List<String> People = Arrays.asList("person1", "person2", "", "", "person3", "", "person4", "");
	System.out.println(People.stream().filter(c->c.isEmpty()).toList());
	
	List<String> People1 = Arrays.asList("person1", "person2", "", "", "person3", "", "person4", "");
	System.out.println(People.stream().filter(d->!d.isEmpty()).toList());
	
	System.out.println(People);
	
	
	//fruits that contains p
	System.out.println(Fruits.stream().filter(e->e.contains("p")).toList());
	
	//animals with length greater than 3
	System.out.println(Animals.stream().filter(f->f.length()>3).toList());
	
	
	List<Integer> Money = Arrays.asList(12937839, -97382, 1827881, -12981, 10000, -1002);
	System.out.println(Money.stream().filter(Credited->Credited>0).toList());
	System.out.println(Money.stream().filter(Debited->Debited<0).toList());
	
	//we use filter to operate with certail element but we use map to operate with every element
	
	//to convert every element into uppercase
	
	List<String> Colors = Arrays.asList("White", "Pink", "Red", "blUe", "BlAcK");
	System.out.println(Colors.stream().map(h->h.toUpperCase()).toList());
	
	//to get table of two
	
	List<Integer> TableOfTwo = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
	System.out.println(TableOfTwo.stream().map(i->i*2).toList());
	
	List<Integer>Multiply= Arrays.asList(1000,2000,9000,200030,19202);
	System.out.println(Multiply.stream().map(j->j*2).toList());
	
	List<Integer> TenPercentAdd = Arrays.asList(100, 200,300, 500);
	System.out.println(TenPercentAdd.stream().map(k->k+k*0.10).toList());
	
	
	
	
	
	
		
	}

}
