package Patterns;

public class Diamond {

    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            printRow(n, i);
        }
        for (int i = n - 1; i > 0; i--) {
            printRow(n, i);
        }
    }


    private static void printRow(int n, int row) {
        // Print spaces
        for (int j = 1; j <= n - row; j++) {
            System.out.print(" ");
        }
        // Print stars
        for (int j = 1; j <= 2 * row - 1; j++) {
            System.out.print("*");
        }
        System.out.println();
    }
}
