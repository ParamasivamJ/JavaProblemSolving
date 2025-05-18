package basicMath;
import java.util.Scanner;

public class LargestNumber {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter A: ");
		int a= sc.nextInt();
		System.out.println("Enter B: ");
		int b= sc.nextInt();
		System.out.println("Enter c: ");
		int c= sc.nextInt();
		
		largest(a,b,c);
		
	}
	public static void largest(int a ,int b , int c) {
		
		if(a>b && a> c ) {
			System.out.println("A is largest");
			return;
		}
		else if(b>c) {
			System.out.println("B is Largest");
			return;
		}
		System.out.println("c is Largest");
		
	}

}


