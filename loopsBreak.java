
public class loopsBreak {

	public static void main(String[] args) {
//		// program 1
		for (int i = 1; i<=5; i++) {
			System.out.println(i);
		}
		
		//program 2 print hello 3 times
		for (int i=1; i<=3; i++) {
			System.out.println("hello");
		}
		
		//program 3 print 5 to 1
		for (int i=5; i>=1; i--) {
			System.out.println(i);
		}
		
		//program 4 even number from 2 to 20
		for (int i=2; i<=20; i= i + 2) {
			System.out.println(i);
		}
		
		//program 5 print 3,2,1
		for (int i=3; i>=1; i--) {
			System.out.println(i);
		}
		
		//program 6 for loop with break 
		for (int i=1; i<4; i++) {
			if (i==3){
			break;
			}
		
		System.out.println(i);
		}
		
//		//program 7 
		for (int i=1; i<=10; i++) {
			System.out.println(i);
			if (i==9) {
				break;
			}
		}
		
		//program 8
		for (int i=5; i>=1; i--) {
			if(i==3) {
				break;
			}
			System.out.println(i);
		}
		
		//program 9
		for(int i=1; i<=5; i++) {
			if(i==3) {
				continue;
			}
			System.out.println(i);
		}
		

	}

}
