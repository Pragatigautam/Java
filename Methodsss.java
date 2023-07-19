
public class Methodsss {

	public static void main(String[] args) {
		//program 1 for starts with method
		String Name = "Pragati";
		boolean BName = Name.startsWith("Pra");
		System.out.println(BName);
		
		
//		//string "pragati3"
//		String Op = "orange";
//		boolean ol = Op.startsWith("Oi");
//		System.out.println(ol);
		
		
		//program 2 for ends with method
		String LName = "Gautam";
		boolean BLName = LName.endsWith("om");
		System.out.println(BLName);
		
		//program 3 replace first method
		String sent1 = "I name is pragati and My last name is gautam";
		String sent2 = sent1.replaceFirst("My", "Your");
		System.out.println(sent2);
		
		//program 4 replace all
		String sent3 = "I live in irving and irving is a great place to live";
		String sent4 = sent3.replaceAll("irving", "dallas");  
		System.out.println(sent4);
		
		//program 5 replace
		String sent5 = sent1.replace("I", "his");
		System.out.println(sent5);
		
		//program 6  concat
		String sent6 = "welcome to ";
		String sent7 = "Pune";
		String sent8 = sent6.concat(sent7);
		System.out.println(sent8);
		
		//program 7 contains
		String sent9 = "I have been living here for quite a while";
		boolean sent10 = sent9.contains("living");
		System.out.println(sent10);
		
		//program 8 equal
		String sent11 = "coding";
		String sent12 = "Coding";
		boolean sent13 = sent11.equals(sent12);
		System.out.println(sent13);
		
		//program 9 ignoreCase
		String sent14 = "cooking";
		String sent15 = "COOking";
		boolean sent16 = sent14.equalsIgnoreCase(sent15);
		System.out.println(sent16); 
		
		//program 10 trim (it removes the space from beginning and end of the sentence
		String sent17 = " I am learning java ";
		String sent18 = sent17.trim();
		System.out.println(sent18);
		
		//program 11 contains
		String sent19 = "I am learning java and python";
		boolean sent20 = sent19.contains("java");
		System.out.println(sent20);
		
		
		
		
		
		
		

	}

}
