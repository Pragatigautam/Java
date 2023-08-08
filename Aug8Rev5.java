import java.util.HashMap;
import java.util.Map;

public class Aug8Rev5 {

	public static void main(String[] args) {
		Map<String, String> Books = new HashMap<String, String>();
		Books.put("You can Win", "Non-fictional");
		Books.put("7 husbands of evelyn hugo", "Fictional");
		Books.put("Harry Potter", "Great books");
		
		for(Map.Entry<String, String> RefVar:Books.entrySet()) {
			System.out.println(RefVar.getKey()+" "+RefVar.getValue());
		}
		
		Map<String, String> Phones = new HashMap<String, String>();
		Phones.put("Iphone7", "2016");
		Phones.put("Iphone8", "2017");
		Phones.put("Iphone9", "2018");
		Phones.put("Iphone10", "2019");
		
		for(String A:Phones.keySet()) {
			System.out.println(A);
		}
		
		for(String B:Phones.values()) {
		System.out.println(B);
		}
		
		System.out.println(Phones.get("Iphone9"));
		
		
		//this for loop not working properly
		for(String K1: Books.keySet()) {
			System.out.println(K1);
			System.out.println(Phones.get(K1));
		}
		
		

	}

}
