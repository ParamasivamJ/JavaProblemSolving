package Patterns;

public class ContinuousNumbersPyramid {
	public static void main(String[] args) {
		int a=1,n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n-i;j++) {
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++) {
				System.out.print(a++ +" ");
			}
			System.out.println();
		}
		
	}

}
