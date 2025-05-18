package basicMath;
import java.util.Scanner;
public class SimpleInterest {
	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
		System.out.print("Enter Principal: ");
		int p=sc.nextInt();
		System.out.print("Enter Interest rate(in percentage): ");
		int r=sc.nextInt();
		System.out.print("Enter Time (in years): ");
		int t=sc.nextInt();
		int si=(p*r*t)/100;
		System.out.println("Simple Interest is: "+si);
	}
}
