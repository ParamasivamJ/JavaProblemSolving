package basicMath;
import java.util.Scanner;
public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter num: ");
		int num=sc.nextInt();
		
		int temp1=num,temp2=num;
		int digit;
		int sum=0;
		int count=0;
		int result=1;
		
		while(num>0) {
			count++;
			num/=10;
		}
			
		while(temp1>0) {
			digit=temp1%10;
			for(int i=1;i<=count;i++) {
				result*=digit;
			}
			sum+=result;
			temp1/=10;
			result=1;
		}
		
		if (temp2==sum) {
			System.out.println(temp2+" is a Armstrong number");
			return;
		}
		System.out.println(temp2+" Not a Armstrong number");	

	}

}
