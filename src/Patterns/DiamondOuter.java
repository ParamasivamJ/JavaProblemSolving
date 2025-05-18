package Patterns;

public class DiamondOuter {

	public static void main(String[] args) {
		int n=5;
		int s=0;
		for(int i=0;i<n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
				
			}
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");}
			
			s+=2;
				
		System.out.println();	
		}
		
		
		
		for(int i=n-1;i>=0;i--) {
			s-=2;
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");
				
			}
			for(int j=1;j<=s;j++) {
				System.out.print(" ");
				
			}
			
			for(int j=1;j<=n-i;j++) {
				System.out.print("*");}
		System.out.println();	
		}
		
		
		
		
	}

}
