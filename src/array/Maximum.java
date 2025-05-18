package array;
import java.util.Scanner;

public class Maximum{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= {0,3,1,4,5,7,-1};
		int max=Integer.MIN_VALUE;
		for(int i:arr) {
			if(i>max) {
				max=i;
			}
		}
		System.out.println(max);
		
	}

}
