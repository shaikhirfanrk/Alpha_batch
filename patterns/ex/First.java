/*package patterns.ex;

public class First {
    public static void main(String[] args) {
        int i,j;
        int N;
        System.out.println("Enter the number of elements to print pattern:");
        for(i=1;i<= N;i++){
            for(j=1;j<=N;j++){
                System.out.println("*");
            }
        }
    }
}*/
package patterns.ex;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        int i, j;
        int N;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows for the rectangular pattern:");
        N = scanner.nextInt();
        for (i = 1; i <= N; i++) {
            for (j = 1; j <= N; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

