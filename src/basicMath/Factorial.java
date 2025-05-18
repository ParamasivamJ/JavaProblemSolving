package basicMath;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter input : ");
		int input = sc.nextInt();	
		long fact=1;
		
		for(int i=1; i<=input; i++) {    // number is inclusive <=
			fact*=i;
		}
		
		System.out.println("Factorial of "+input+ " is "+fact);
				
	}

}
