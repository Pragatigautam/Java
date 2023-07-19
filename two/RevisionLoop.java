package two;

public class RevisionLoop {

	public static void main(String[] args) {
		//for loop print hello 3 times
		for (int i=1; i<=3; i++) {
			System.out.println("hello");
		}
		
		//print 5 to 1 for loop
		for (int i1=5; i1>=1; i1--) {
		System.out.println(i1);	
		}
		
		//even number from 2 to 20
		for (int i2= 2; i2<=20; i2=i2+2) {
			System.out.println(i2);
		}
		
		//also another way
		for (int i3=1; i3<=20; i3++) {
			if (i3%2==0) {
				System.out.println(i3);
			}
		}
		
		//print 3,2,1
		for (int i4=3; i4>=1; i4--) {
			System.out.println(i4);
		}
		
		//print 1 to 10 but break at 6 {output will be 1,2,3,4,5}
		for (int i5=1; i5<=10; i5++) {
			
			
			if (i5==6) {
			break;
			}
			System.out.println(i5);	
			
		}
		
		//break at 16 but PRINT 16 from 1 to 20
		for (int i6=1; i6<=20; i6++) {
			System.out.println(i6);
			if (i6==16) {
				break;
		
		

	}

		}
		
		
		
		//print 5 to 1 but break at 3
		
		for(int a=5; a>=1; a--) {
			if (a==3) {
				
				break;
			}
			System.out.println(a);
		}
		
		//print 1 to 5 but not 4
		for (int b=1; b<=5; b++) {
			
			if (b==4) {
				continue;
			}
			System.out.println(b);
				
		}
		
		//while loop
		
		//print 1 to 5
		int f=1;
		while (f<=5){
			System.out.println(f);
			f++;
		}
		
		//print 20 to 1 in reverse
		
		int u= 20;
		while (u>=1) {
			System.out.println(u);
			u--;
		}
		
		//table of 5 in reverse
		
		int t=50;
		while (t>=5) {
			System.out.println(t);
			t=t-5;
		}
		
		//print hello 5 times
		int m=1;
		while (m<=5) {
			System.out.println("hello");
			m++;
		}
		
		//table of 7 but break at 35
		int n=7;
		while (n<=70) {
			if (n==35) {
				
				break;
			}
			System.out.println(n);
			n=n+7;
		}
		
		//table of 10 in reverse but skip 90
		int h=100;
		while (h>=10) {
			if (h==90) {
				h=h-10;
				continue;
		}
			System.out.println(h);
			h=h-10;
		}
		
		//table of 4 but break after 16
		int y=4;
		while(y<=40) {
		System.out.println(y);
		if (y==16)
			break;
		y=y+4;
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
	
