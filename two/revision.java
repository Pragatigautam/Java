package two;

public class revision {

	public static void main(String[] args) {
		//calling function AddA
				AddA();
				
		// calling function AddB
				AddB(13, 19);
				
				
		//calling function AddC
		int sum = AddC(12, 5);

		
		
		
	}

	//  without parameter and without return type

		public static void AddA() {
			System.out.println(9 + 9);
		}

		//  with parameter and without return type

		public static void AddB(int a, int b) {
			System.out.println(a + b);
		}

		public static int AddC(int a, int b) {
			System.out.println(a + b);
			return a + b

			;
			
		}

}
