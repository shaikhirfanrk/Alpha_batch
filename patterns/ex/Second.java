package patterns.ex;
import java.util.Scanner;

public class Second {
    public static void main(String[] args) {
        int i,j;
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the value to print the pattern:");
        n = scanner.nextInt();
        for(i=1;i<=n;i++){
            for(j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
