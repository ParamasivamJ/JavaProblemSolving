package array;
import java.util.Scanner;

public class Sum {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= {1,3,2,4};
		int sum=0;
		for(int i:arr) {
			sum+=i;
		}
		System.out.println(sum);
		
	}

}
