package Patterns;

public class Test {

	public static void main(String[] args) {
		int n=4;
		for(int i=1;i<=n*2;i++) {
			for(int j=1;j<n*2;j++) {
				if((i+j>=n+1 && j-i<=n-1)&&(i - j <= n - 1 && i + j <= 3 * n - 1)) {
					System.out.print("* ");
					}
				else System.out.print("  ");
				
			}		
				
		System.out.println();	
		}
		
		
	/*	(i+j>=n+1) && (j-i <=n-1)&&(i-j<=n-1) && (i+j<(n*(n-1)))
		for(int i=n-2;i>=0;i--) {
	
			for(int j=1;j<n-i;j++) {
				System.out.print(" ");
				
			}
			for(int j=1;j<=2*i+1;j++) {
				System.out.print("*");
				
			}

		System.out.println();	
		}
		
		*/
		
		
	}

}
