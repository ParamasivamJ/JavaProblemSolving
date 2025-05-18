package basicMath;
import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter number : ");
		int input= sc.nextInt();
		if(input % 2==0) {
			System.out.println(input +" is Even");
			return;
		}
		System.out.println(input+" is Odd");
	}

}
