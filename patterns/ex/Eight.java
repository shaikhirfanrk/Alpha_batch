package patterns.ex;

public class Eight {
        public static void nStarTriangle(int n) {
            for(int i=n; i>0; i--){
                for(int j=i; j<n; j++){
                    System.out.print(" ");
                }
                for(int k=0; k<2*i-1; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        public static void main(String[] args) {
            nStarTriangle(3);
        }
}
