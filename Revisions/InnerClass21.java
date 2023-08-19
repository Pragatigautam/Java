package Revisions;

public class InnerClass21 {

	public static void main(String[] args) {
		
		Computer2 C  = new Computer2(102, "Apple");
		System.out.println(C.price);
		System.out.println(C.brand);
		
		System.out.println(C.displayPrice());
		
		Computer2.CPU2 objCPU = C.new CPU2(64, "M1");
		System.out.println(objCPU.Space);
		System.out.println(objCPU.Processor);
		
		System.out.println(objCPU.displayProcessor());
			
		
		
		

	}

}

class Computer2{
	int price;
	String brand;
	
	public Computer2(int p, String b) {
		this.price = p;
		this.brand = b;
	}
	public int displayPrice() {
		return this.price;

		}
	
class CPU2{
	
	int Space;
	String Processor;
	
	public CPU2(int Spc, String Prc) {
		this.Space = Spc;
		this.Processor = Prc;
	}
	
	public String displayProcessor() {
		return this.Processor;
	}
	
}
}
