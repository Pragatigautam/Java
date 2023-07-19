package two;

public class Rev4Exam2 {

	public static void main(String[] args) {
		
	//for loop print hello 3 times
		
		for (int i=1; i<=3; i++) {
			System.out.println("hello");
		}
		
		
		//print 5 to 1
		for (int i1=5; i1>=1; i1--) {
			System.out.println(i1);
			
		}
		
		//even number  2 to 20
		for (int i=2; i<=20; i=i+2) {
			System.out.println(i);
		}
		
		// 1 to 10 but break at 6
		
		for (int i=1; i<=10; i++) {
			
			if (i==6) {
				break;
			}
			
			System.out.println(i);
			
		}
		
		
		//1 to 20 but break after 16
		for (int i=1; i<=20; i++) {
			System.out.println(i);
			if (i==16) {
				break;
			}
				
			
		}
		
		
		//5 to 1 break at 3
		
		for (int i=5; i>=1; i--) {
			if (i==3) {
				break;
			}
			System.out.println(i);
		}
		
		
		//print 1 to 5 but not 4
		for (int i=1; i<=5; i++) {
			
			if (i==4) {
				continue;
				
			}
			
			System.out.println(i);
		}
		
		
		//while loop 1 to 5
		int i=1;
		while (i<=5) {
			System.out.println(i);
			i++;
		}
		
		
		//while loop 20 to 1
		
		int i1=20;
		while(i1>=1) {
			System.out.println(i1);
			i1--;
			
		}
		
		//table of 5 in reverse
		
		int i2=50;
		while (i2>=1) {
			System.out.println(i2);
			i2=i2-5;
		}
		
		//hello 5 times
		int j = 1;
		while (j<=5) {
			System.out.println("hello");
			j++;
		}
		
		//table of 7 but break at 35
		
		int k = 7;
		while (k<=70) {
			
			if(k==35) {
				break;
			}
			System.out.println(k);
			k=k+7;
		}
		
		
		//table of 10 in reverse but skip 90
		int l=100;
		while (l>=10) {
			
			if (l==90) {
				l=l-10;
				continue;
			}
			System.out.println(l);

			l=l-10;
			
			
		
		}
		
		
		//table of 4 but break after 16
		
		
		
		int p=4;
		while (p<=40) {
			System.out.println(p);
			if (p==16) {
				break;
			}
			p=p+4;
			
		}
		
		
		
		
	
		

	}



}
