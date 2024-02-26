package patterns.ex;/*package patterns.ex;

import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        int i, j, k;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print Pattern:");
        n = scanner.nextInt();

        // Upper part of the pattern
        for (i = 0; i < n; i++) {
            for (j = i; j < n - 1; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (i = n - 1; i > 0; i--) {
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (k = 0; k < 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}*/
import java.util.Scanner;

public class Ten {
    public static void main(String[] args) {
        int i, j, k;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print Pattern:");
        n = scanner.nextInt();

        // Upper part of the pattern
        for (i = 0; i < n-1; i++) {
            /*for (j = i; j < n - 1; j++) {
                System.out.print(" ");
            }*/
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the pattern
        for (i = n-1; i >= 0; i--) { // Adjust loop start and condition for right half
            //for (j = 1; j < i; j++) {
            //    System.out.print(" ");
            //}
            for (k = 0; k < 2 * i + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


