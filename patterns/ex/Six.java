package patterns.ex;

import java.util.Scanner;

public class Six {
    public static void main(String[] args) {
        int i,j;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value to print the pattern:");
        n = scanner.nextInt();
        for(i=n;i>=1;i--){
            for(j=1;j<=i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
