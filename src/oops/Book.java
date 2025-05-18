package oops;

public class Book {
	String book;
	
	Book(String Book){
		this.book=Book;		
	}
	
	//method to recieve and print the object ref
	static void printref(Book ref) {
		System.out.println(ref);
	}

	public static void main(String args[]) {
		Book b1= new Book("Java");
		Book b2= new Book("Java");
		Book b3=b1;		// copying object reference
		
		System.out.println(b1.equals(b2));
		System.out.println(b1==b2);
		System.out.println(b1==b3);
		
		printref(b1);		
	}
	
	
}
