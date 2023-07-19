
public class InheritPT7t3821 {

	public static void main(String[] args) {
		
		HumanN pg = new HumanN(128632);
		System.out.println(pg.ssn);
		
		
		Studentt PGA = new Studentt(1286327);
		PGA.DisplaySSN();
		

	}

}

class HumanN{
	protected int ssn;
	
	
	public HumanN(int SN) {
		this.ssn= SN;
	}
}

class Studentt extends HumanN{
	public Studentt(int SN) {
		super (SN);
	}
	
	public void DisplaySSN() {
		System.out.println(this.ssn);
	}
}
