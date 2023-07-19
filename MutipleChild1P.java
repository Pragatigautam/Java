
public class MutipleChild1P {

	public static void main(String[] args) {
		
		SonC Anuj = new SonC("Vidya", "Gautam", "Anuj Babu");
		Daughter Prags = new Daughter ("Vidya", "Gautam", "Pragati");
		
		System.out.println(Anuj.MFName);
		System.out.println(Anuj.MLName);
		System.out.println(Anuj.SFName);
		
		Anuj.DisplayMFullname();
		Anuj.DisplayName();
		
		System.out.println(Prags.DFName);
		System.out.println(Prags.MFName);
		System.out.println(Prags.MLName);
		
		Prags.DisplayMFullname();
		Prags.DisplayName();
		

	}

}

class Mother{
	String MFName;
	String MLName;
	
	
	public Mother(String MFN, String MLN) {
		this.MFName = MFN;
		this.MLName = MLN;
	}
	
	public void DisplayMFullname() {
		System.out.println(this.MFName + this.MLName);
	}
}

class SonC extends Mother{
	String SFName;
	
	public SonC (String MFN, String MLN, String SFN) {
		super (MFN,MLN);
		this.SFName = SFN;
	}
	public void DisplayName() {
		System.out.println(this.SFName + this.MLName);
	}
}

class Daughter extends Mother{
String DFName;
	
	public Daughter (String MFN, String MLN, String DFN) {
		super (MFN,MLN);
		this.DFName = DFN;
	}
	public void DisplayName() {
		System.out.println(this.DFName + this.MLName);
	}
	
}