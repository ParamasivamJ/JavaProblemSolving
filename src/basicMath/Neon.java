package basicMath;

public class Neon {
	public static void main(String[] args) {
		int num=9, square=num*num;
		int digit, sum=0;
		
		while(square>0) {
			digit=square%10;
			sum+=digit;
			square/=10;			
		}
		
		if(num == sum) {System.out.println("Yes");;}
		else {System.out.println("No");}
		
	}
}
