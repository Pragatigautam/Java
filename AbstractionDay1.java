
public class AbstractionDay1 {

	public static void main(String[] args) {
		
		SBIBanks ktm = new SBIBanks();
		ktm.BranchName();
		ktm.DisplayCountry();
		ktm.loan();
		ktm.save();
		
		
		PNBBanks bkt = new PNBBanks();
		bkt.BranchName();
		bkt.loan();
		bkt.save();
		bkt.DisplayCountry();
		

	}

}

abstract class WorldBanks{
	abstract void loan();
	abstract void save();
	
	public void DisplayCountry() {
		System.out.println("this is nepal");
	}
	
}

class SBIBanks extends WorldBanks{
	public void loan() {
		System.out.println("this is loan for SBIBank");
	}
	public void save() {
		System.out.println("this is save for SBIBank");
	}
	public void BranchName() {
		System.out.println("our branch name is kathmandu");
	}
}

class PNBBanks extends WorldBanks{
	public void loan() {
		System.out.println("this is loan for PNBBanks");
	}
	public void save() {
		System.out.println("this is save for PNBBanks");
	}
	
	public void BranchName() {
		System.out.println("our branch name is Bhaktapur");
	}
	
}
