package array;
import java.util.Scanner;

public class RightShift {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int size=sc.nextInt();
		
		int[] arr= new int[size];
		for (int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
			}
		int temp=arr[arr.length-1];
		for (int i = arr.length-1; i >0; i++) {
			arr[i]=arr[i-1];
			}
		arr[0]=temp;
		
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
			
		}
		
	}

}
