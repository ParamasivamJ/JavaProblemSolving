package basicMath;
import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num= sc.nextInt();
		int result=reverse(num);
		System.out.println("Reverse of "+num+" is "+ result);
	}
	
	public static int reverse(int num) {
		int rev=0;
		while(num!=0) {
		int digit= num%10;
		rev=rev*10+ digit;
		num/=10;
		}
		return rev;	
	}
	

}
