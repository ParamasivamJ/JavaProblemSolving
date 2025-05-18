package basicMath;
import java.util.Scanner;

public class Spy {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt();
		int sum=0, product=1;
		int digit;
		
		while(num>0) {
			digit=num%10;
			sum+=digit;
			product*=digit;
			num/=10;			
		}
		
		if (sum==product) {System.out.println("yes");}
		else System.out.println("no");
	}

}
