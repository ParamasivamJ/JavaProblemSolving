package basicMath;
import java.util.Scanner;

class HappyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt(); 
        int sum;                
        int digit;              

        do {
            sum = 0; // Reset sum for each iteration

            // Calculate the sum of squares of digits
            while (num > 0) {
                digit = num % 10; 
                sum += (digit * digit); 
                num /= 10; 
            }

            // Check if the sum is 1 (happy number)
            
            //if(sum==1 || sum==7)
            if (sum == 1) {
                System.out.println("Happy Number!");
                break;
            }

            // Check for cycles: if the number does not change
            if (sum ==4) { // Known cycle value for unhappy numbers
                System.out.println("Not a Happy Number!");
                break;
            }

            // Update num to the sum for the next iteration
            num = sum;

        } while (true); // Continue until the loop is explicitly broken
    }
}
