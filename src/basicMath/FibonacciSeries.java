package basicMath;
import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num= sc.nextInt();
		int first=0, second=1;
		for(int i=0;i<num;i++) {
			System.out.print(first+" ");
			int current= first+second;
			first=second;
			second=current;
			
		}
		
		
	}

}
