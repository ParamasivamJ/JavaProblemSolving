package basicMath;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter Number : ");
		int input= sc.nextInt();
		
		if (input<=1) {
			System.out.println("Not A prime!");
			return;
		}
		
		for(int i= 2; i<input ;i++) {
			if (input%i ==0) {
				System.out.println("Is Not Prime!");
				return;
			}
		}
		System.out.println("Is Prime");
	}

}
