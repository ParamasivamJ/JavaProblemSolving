package array;
import java.util.Scanner;

public class Minimum{

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int[] arr= {0,3,1,4,5,7,-1};
		int min=Integer.MAX_VALUE ;
		for(int i:arr) {
			if(i<min) {
				min=i;
			}
		}
		System.out.println(min);
		
	}

}
