package basicMath;
import java.util.Scanner;

public class Factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        
        int num = sc.nextInt();
        
        /*If i is a divisor of num, then num/i is also a divisor */
 
        for (int i = 1; i * i <= num; i++) { // Check factors(divisors) up to sqrt(num)
            
        	if (num % i == 0) {
                System.out.print(i + " ");  // Print the smaller divisor
                
                if (i != num / i) {  // Avoid duplicate for perfect squares
                    System.out.print((num / i) + " ");  // Print the paired divisor
                }
            }
        }
    }
}

