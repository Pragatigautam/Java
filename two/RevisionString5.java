package two;

public class RevisionString5 {

	public static void main(String[] args) {
		//print character of string using each loop
		//for loop
		String city= "kathmandu";
		for (int i=0; i<city.length(); i++) {
			System.out.println(city.charAt(i));
		}
		
		//while loop
		int i1=0;
		while(i1<city.length()) {
			System.out.println(city.charAt(i1));
			i1++;
		}
		
		//for each loop
		
		for (char NewCity:city.toCharArray()) {
		System.out.println(NewCity);	
		}
		
		//to uppercase
		String Uc= city.toUpperCase();{
			System.out.println(Uc);
			
		}
		
		//to lowercase
		String Lc= Uc.toLowerCase();{
			System.out.println(Lc);
		}
		
		//trim
		String NonTrim = " red ";
		String TTream = NonTrim.trim();{
		System.out.println(TTream);	
		System.out.println(NonTrim.length());
		System.out.println(TTream.length());
		}
		
		//strats with
		boolean result = city.startsWith("k");
		System.out.println(result);
		
		//ends with
		boolean result1= city.endsWith("u");
		System.out.println(result1);
		
		//replace, replaceAll, replaceFirst
		
		String sentence = "this is a java class and we are a learning java";
		String Rsentence = sentence.replace('a', 't');
		System.out.println(Rsentence);
		
		
		String RFsentence = sentence.replaceFirst("java", "javascript");
		System.out.println(RFsentence);
		
		String RAsentence = sentence.replaceAll("java", "python");
		System.out.println(RAsentence);
		
		//concat
		String FName= "Biplov";
		String LName= "Adhikari";
		String FullName= FName.concat(LName);
		System.out.println(FullName);
		
		//equals and equalsIgnore
		String AB = "AdhikaRi";
		String CD = "adhikari";
		boolean EF = AB.equals(CD);
		System.out.println(EF);
		
		boolean GH = AB.equalsIgnoreCase(CD);
		
		System.out.println(GH);
		
		//contains
		boolean name = AB.contains("ka");
		System.out.println(name);
		
		//split sentence from line 54 using for each loop
		String [] NewSen = sentence.split(" ");
		for (String poo:NewSen) {
		System.out.println(poo);
		}
		
		//substring (substring prints whatever is after that index)
		String state = "Texas";
		String NState = state.substring(3);
		System.out.println(NState);
		
		
		String g = state.substring(1, 4);
		System.out.println(g);
		
		
		//reverse of string
		String device = "laptop";
		String revDevice = "";
		for (int k=0; k<device.length(); k++) {
		revDevice = device.charAt(k)+ revDevice;
		}
		System.out.println(revDevice);
		
		//another rev 
		String TDevice = "television";
		String RTD= "";
		for (int h=0; h<TDevice.length(); h++) {
			RTD= TDevice.charAt(h)+ RTD;
		}
		System.out.println(RTD);
		
		
		
		
		// different approach of reverse
		String City2 = "Irving";
		String RCity2 = "";
		for (int d=City2.length()-1; d>=0; d--) {
		RCity2=RCity2+ City2.charAt(d);
		}
		System.out.println(RCity2);

		
		
		
		
		
		
		
		
		
		

	}

}
