
public class whileeLoop {

	public static void main(String[] args) {
		//program 1, print 1 to 3
		int t1=1;
		while (t1<=3) {
			System.out.println(t1);
			t1++;
		}
		
		//program 2, print 1 to 5
		
		int t2=1;
		while (t2<=5) {
			System.out.println(t2);
			t2++;
		}
		
		//program 3, table of 5
		int t3=5;
		while (t3<=50) {
			System.out.println(t3);
			t3=t3+5;
		}
		
		//program 4, table of 3 reverse
		int t4=30;
		while (t4>=3){
			System.out.println(t4);
			t4=t4-3;
			
		}
		
		//program 5, print hello 3 times
		int t5=1;
		while (t5<=3) {
			System.out.println("hello");
			t5++;
		}
		
		//program 6, table of 7 reverse but break at 35
		int t6=70;
		while (t6>=7) {
			System.out.println(t6);
			if (t6==35) {
				break;
				
			}
			t6=t6-7;
		}
		
		//program 7, print 1 to 10 but don't print 5
		int t7=1;
		while (t7<=10) {
			if (t7==5) {
				t7++;
				continue;
				
			}
			System.out.println(t7);
			t7++;
			
			
		}
		
		//program7 rewrite
		int t8=1;
		while (t8<=10) {
			if (t8==5) {
				t8++;
				continue;
			}
			System.out.println(t8);
			t8++;
		}
		
		
		
			

	
	}

}
