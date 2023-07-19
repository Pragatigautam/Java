
public class casesAndSubstringss {

	//reverse of pune
	public static void main(String[] args) {
		String city = "pune";
		String revCity = "";
		for (int i=0; i<city.length(); i++) {
			revCity = city.charAt(i) + revCity;
		}
		
		System.out.println(revCity);
		
		//reverse ion another way
		
		String city2 = "Jaipur";
		String cityReverse = "";
		
		for (int i=city2.length()-1; i>=0; i--) {
			cityReverse = cityReverse + city2.charAt(i);
		}
		System.out.println(cityReverse);
		
		//print kathmandu in uppercase
		
		String city3= "kathmandu";
		String UC = city3.toUpperCase();
		System.out.println(UC);
		
		//print NAGpuR in lowercase
		
		String city4 = "NAGpuR";
		String LC = city4.toLowerCase();
		System.out.println(LC);
		
		
		// print the length of kathmandu
		
		String city5 = "kathmandu";
		int Leng = city5.length();
		System.out.println(Leng);
		
		// print uppercase lowercase length 
		String city6 = "chandrapur";
		int newCity = city6.toUpperCase().toLowerCase().length();
		System.out.println(newCity);
		
		//character of city rajkot
		
		String city7 = "rajkot";
		char cityC = city7.charAt(city7.length()-1);
		System.out.println(cityC);
		
		//substring of jaipur
		
		String city8 ="Jaipur";
		String subs = city.substring(1, 3);
		System.out.println(subs);
		
		
		
		

	}

}
