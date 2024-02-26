package patterns.ex;

import java.util.Scanner;

public class Seven {
    public static void main(String[] args) {
        int i,j,k;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to print Pattern:");
        n = scanner.nextInt();
            for(i=0;i< n;i++){
                for(j=i;j<n-1;j++) {
                    System.out.print(" ");
                }
                for (k=1;k<=2*i+1; k++){
                    System.out.print("*");
                }
                System.out.println();
                }
            }

    }

