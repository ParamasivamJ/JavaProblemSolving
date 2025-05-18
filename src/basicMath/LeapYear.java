package basicMath;
import java.util.Scanner;

public class LeapYear {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter Number: ");
		int year=sc.nextInt();
		
		if ((year%4==0)&&(year%100!=0)||(year%400==0)) {
			System.out.println(year+" is a Leap Year!");
			return;
		}
		System.out.println(year+" Not a Leap Year!");
 }
}
