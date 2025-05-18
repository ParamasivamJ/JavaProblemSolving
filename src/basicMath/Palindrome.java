package basicMath;

import java.util.Scanner;
class Palindrome{
    public static void main(String[] args){
		 	Scanner sc=new Scanner(System.in);
			System.out.println("Enter Number: ");
			int num=sc.nextInt();
			int temp= num;
			int rev=0;
			int digit;

			while(num>0){
				digit=num%10;
				rev=rev*10+digit;
				num/=10;
				}
			if(temp==rev) {System.out.println("yes"); }
		
			else{System.out.println("No");}
		}


}
