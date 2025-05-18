package Patterns;

public class Alphabets {

	public static void main(String[] args) { 
        int n=5;
        //for (int i = 1; i <= n; i++) {
        for (int i = n; i>0; i--) {
        	char a='A';
            for (int j = 1; j <= i; j++) {
                System.out.print(a);
                
            }
            a+=1;
        System.out.println();
        }


	}

}
