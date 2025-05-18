package basicMath;

public class Harshad {
	public static void main(String[] args) {
		int num=81,temp=num; //126
		int digit,sum=0;
		
		while(num>0) {
			digit=num%10;
			sum+=digit;
			num/=10;			
		}
		
		if(temp%sum==0) {System.out.println("Harshad");}
		else System.out.println("Not Harshad");
	}

}
