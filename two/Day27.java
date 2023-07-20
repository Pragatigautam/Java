package two;

public class Day27 {

	public static void main(String[] args) {
		
		CPU M1 = new CPU();
		System.out.println(M1.price);
		
		int Price = M1.DisplayPrice();
		System.out.println(Price);
		
		CPU.Processor ProcessorOne = M1.new Processor();
		System.out.println(ProcessorOne.Manufacterer);
		System.out.println(ProcessorOne.DisplaySpeed());
		

	}

}

class CPU{
	int price = 200;
	
	public int DisplayPrice() {
		return this.price;
	}
	
	class Processor{
		String Manufacterer = "Pragati";
		
		public String DisplaySpeed() {
			return "fast";
		}
		
	}
}
