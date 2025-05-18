package basicMath;
import java.util.Scanner;
public class XylemNumber {

	public static void main(String[] args) {
	 	Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num=sc.nextInt();
		int lastsum=0,midsum=0;
		
		lastsum+=num%10; // last digit
		num=num/10;

		while(num>9) {
			midsum+=num%10;
			num/=10;
		}
		
		lastsum+=num; // first digit
		
		if(lastsum==midsum) {
			System.out.println("Xylem");
			return;
		}
		System.out.println("Phloem");
		
	}

}
