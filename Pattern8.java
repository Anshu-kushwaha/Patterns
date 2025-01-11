import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of lines: ");
        int n = s.nextInt();
        Pattern8 p = new Pattern8();
        p.Pattern(n); 
        s.close();
    }
    void Pattern(int n){
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
}
