package basicMath;
import java.util.Scanner;

public class Perfect {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1;i<=num/2;i++) {
			if(num%i==0) {
				sum+=i;
				System.out.println(i);//divisors
			}

		}
		if (sum ==num) {System.out.println("yes");}
		
		else System.out.println("No");
		
	}

}
