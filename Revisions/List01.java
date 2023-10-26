package Revisions;

import java.util.Arrays;
import java.util.List;

public class List01 {

	public static void main(String[] args) {
		List<String> Names = Arrays.asList("Pragati", "",  "Biplov", "Prajwol","", "Bipisha", "");
		System.out.println(Names.stream().filter(a->a.isEmpty()).count());
		
		List<String> Students = Arrays.asList("Pragati", "",  "Biplov", "Prajwol","", "Bipisha", "");
		System.out.println(Students.stream().filter(b->b.isEmpty()).toList());
		
	
		List<String> Animals = Arrays.asList("Ant", "Bear", "", "", "Cat", "Dog", "", "Elephant");
		System.out.println(Animals.stream().filter(c->!c.isEmpty()).toList());
		
		List<String> Namess = Arrays.asList("All", "The", "", "Pretty", "", "Girls", "Walk", "Like", "", "This");
		System.out.println(Namess.stream().filter(d->d.contains("i")).toList());
		
		List<String> Namesss = Arrays.asList("All", "The", "", "Pretty", "", "Girls", "Walk", "Like", "", "This");
		System.out.println(Namesss.stream().filter(e->e.startsWith("T")).toList());
		
		
		List<String> NMS = Arrays.asList("All", "The", "", "Pretty", "", "Girlssss", "Walkssss", "Like", "", "This");
		System.out.println(NMS.stream().filter(f->f.length()>4).toList());
	
		
		List<Integer> BankT = Arrays.asList(100, -200, 3000, 4000, -293, -28392, 20010102);
		System.out.println(BankT.stream().filter(g->g>0).toList());
		System.out.println(BankT.stream().filter(h->h<0).toList());
		
		
		List<String> Song = Arrays.asList("All", "The", "", "Pretty", "", "Girls", "Walk", "Like", "", "This");
		System.out.println(Song.stream().map(i->i.toUpperCase()).toList());
		
		
		List<Integer> Multiply = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
		System.out.println(Multiply.stream().map(j->j*2).toList());
		
		
		List<Integer>TenPcnt = Arrays.asList(12000, 20382, 92832, 19812, 991829);
		System.out.println(TenPcnt.stream().map(k->k*0.10).toList());
		

	}

}
