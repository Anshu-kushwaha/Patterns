import java.util.Scanner;

public class Pattern9 {

    void Pattern(int n){
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n-i-1; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            // Print spaces
            for (int j = 0; j < n - i; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int j = 0; j < 2 * i - 1; j++) {
                System.out.print("*");
            }
            // Move to the next line
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = s.nextInt();
        Pattern9 p = new Pattern9();
        p.Pattern(n);
        s.close();
    }
}
