package two;

import java.util.ArrayList;

public class lists {

	public static void main(String[] args) {
		ArrayList<String> Students = new ArrayList<>();
		boolean a = Students.add("Pragati");
		System.out.println(a);
		Students.add("Prajwol");
		Students.add("Biplov");
		Students.add("Gautam");
		Students.add("Pradeep");
		System.out.println(Students);
		Students.add(2, "Adhikari");
		System.out.println(Students);
		
		Students.remove(1);
		System.out.println(Students);
		Students.remove("Gautam");
		System.out.println(Students);
		
		Students.clear();
		System.out.println(Students);
		
		Students.add("Bipisha");
		Students.add("Sophiya");
		Students.add("Sarthak");
		Students.add("Rabina");
		Students.add("Vidya");
		System.out.println(Students);
		
		Students.set(2, "Madhe");
		System.out.println(Students);
		
		boolean b = Students.contains("madhe");
		System.out.println(b);
		
		String C = Students.get(4);
		System.out.println(C);
		
		
		int D = Students.indexOf("Rabina");
		System.out.println(D);
		
		
		ArrayList<String> Books = new ArrayList<>();
		Books.add("Maths");
		Books.add("Science");
		Books.add("Computer Science");
		Books.add("English");
		
		String Input = "Computer Science";
		if(Books.contains(Input)) {
			System.out.println("This book is available");
		}
		else {
			System.out.println("This book is not available");
		}
		
		if(Books.indexOf("Computer Science")>=0) {
			System.out.println("This book is available");
		}
		else {
			System.out.println("This book is not available");
		}
		
		ArrayList<String> Countries = new ArrayList<>();
		Countries.add("Nepal");
		Countries.add("India");
		Countries.add("USA");
		Countries.add("Canada");
		Countries.add("China");
		Countries.add("Nepal");
		
		
		
		System.out.println(Countries);
		System.out.println(Countries.size());
		
		System.out.println(Countries.indexOf("Canada"));
		System.out.println(Countries.indexOf("Nepal"));
		System.out.println(Countries.lastIndexOf("Nepal"));
		
	
		
		
		

	}

}
