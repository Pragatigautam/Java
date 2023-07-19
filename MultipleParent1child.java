
public class MultipleParent1child {

	public static void main(String[] args) {
		
		Sonn Pragati = new Sonn ("Shree", "Gautam", "Pradeep", "Pragati");
		System.out.println(Pragati.FFName);
		System.out.println(Pragati.GFName);
		System.out.println(Pragati.GLName);
		System.out.println(Pragati.SFName);
		
		Pragati.SFullName();
		
		
		

	}

}

//first parent with constructor

class Grandfather{
	String GFName;
	String GLName;
	
	public Grandfather (String GFN, String GLN) {
		this.GFName = GFN;
		this.GLName = GLN;
	}
	
	public void GFullName() {
		System.out.println(this.GFName + this.GLName);
	}
	
}



class Fatherr extends Grandfather{
	String FFName;

	
	public Fatherr (String GFN, String GLN, String FFN) {
		super (GFN,GLN);
		this.FFName = FFN;
		
	}
	
	public void FFullName() {
		System.out.println(this.FFName + this.GLName);
	}
	
}

class Sonn extends Fatherr{
	String SFName;

	
	public Sonn (String GFN, String GLN, String FFN, String SFN) {
		super (GFN,GLN,FFN);
		this.SFName = SFN;
		
	}
	
	public void SFullName() {
		System.out.println(this.SFName + this.GLName);
	}
	
}

