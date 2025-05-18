package array;

import java.util.Scanner;

class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int size = sc.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        // Rotate the array n times
        for (int j = 0; j < n; j++) {
            int temp = arr[arr.length - 1];
            for (int i = arr.length - 1; i > 0; i--) {
                arr[i] = arr[i - 1];
            }
            arr[0] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
