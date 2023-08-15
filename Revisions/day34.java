package Revisions;

import java.util.Map;

interface Course{
	
		public void courseOne();
		public void courseTwo();
		public void courseThree();
		public void courseFour();
		public void courseFive();
		public void courseSix();
}

class Zorba implements  Course{
	@Override
	public void courseOne() {
		// TODO Auto-generated method stub
		System.out.println("Zorba one");
	}

	@Override
	public void courseTwo() {
		// TODO Auto-generated method stub
		System.out.println("Zorba two");
	}

	@Override
	public void courseThree() {
		// TODO Auto-generated method stub
		System.out.println("Zorba three");
	}

	@Override
	public void courseFour() {
		// TODO Auto-generated method stub
		System.out.println("Zorba four");
	}

	@Override
	public void courseFive() {
		// TODO Auto-generated method stub
		System.out.println("Zorba five");
	}

	@Override
	public void courseSix() {
		// TODO Auto-generated method stub
		System.out.println("Zorba six");
	}
	

}

class Minskole implements Course {

	@Override
	public void courseOne() {
		// TODO Auto-generated method stub
		System.out.println("one");
	}

	@Override
	public void courseTwo() {
		// TODO Auto-generated method stub
		System.out.println("two");
	}

	@Override
	public void courseThree() {
		// TODO Auto-generated method stub
		System.out.println("three");
	}

	@Override
	public void courseFour() {
		// TODO Auto-generated method stub
		System.out.println("four");
	}

	@Override
	public void courseFive() {
		// TODO Auto-generated method stub
		System.out.println("five");
	}

	@Override
	public void courseSix() {
		// TODO Auto-generated method stub
		System.out.println("six");
	}
	
}










public class day34 {

	public static void main(String[] args) {
		
		
		Course firm;
	
		firm = new Zorba();
		firm.courseFive();
		
		firm = new Minskole();
		firm.courseThree();
		
		
	}
	
	

}