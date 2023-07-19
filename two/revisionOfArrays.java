package two;

public class revisionOfArrays {

	public static void main(String[] args) {
		String [] fruits = {"appple", "mango", "banana" , "strawberries"};
		for (String a: fruits) {
			System.out.println(a);
		}
		
		String [] students = {"pragati", "biplov", "prajwl", "bipisha"};
		for (String b: students) {
			System.out.println(b);
		}
		
		int [] Nstudents = new int [5];
		Nstudents [0] = 100;
		Nstudents [1] = 200;
		Nstudents [2] = 300;
		Nstudents [3] = 790;
		Nstudents [4] = 9274;
		
		for (int i=0; i<Nstudents.length; i++) {
		System.out.println(Nstudents[i]);
		}
		
		int[] a= new int [5];
		a[0]=203;
		a[1]=302;
		a[2]=402;
		a[3]=530;
		a[4]=594;
		System.out.println(a[3]);
		
		
		//string 
		String [] apple = {"pie","cake","iphone","juice"};
		System.out.println(apple[0]);
		
		
		//multidimentional array
		int [][] spider= {
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		for (int p=0; p<spider.length; p++) {
		int pink []=spider[p];
		for (int q=0; q<pink.length; q++) {
			System.out.println(pink[q]);
		}
		}
		
		
		
		
		
		
		
		
		
		
		

	}

}
