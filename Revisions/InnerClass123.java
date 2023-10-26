package Revisions;

public class InnerClass123 {

	public static void main(String[] args) {
		
		Computer8 C = new Computer8(100, "Apple");
		Computer8.CPU8 CPUObj= C.new CPU8(64, "M1");
		
		
		System.out.println(CPUObj.Space);
		

	}

}
class Computer8{
	int Price;
	String Brand;
	
	public Computer8(int P, String B) {
		this.Price = P;
		this.Brand = B;
		
	}
	
	class CPU8{
		int Space;
		String Processor;
		
		public CPU8(int SP, String PC) {
			this.Space = SP;
			this.Processor = PC;
		}
	}
}
