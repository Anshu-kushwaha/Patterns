
import java.util.Scanner;

public class Pattern12 {
    void Pattern(int n) {
        int space = 2 * (n - 1);
        for (int i = 1; i < n+1; i++) {
            
            // numbers
            
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // space
            
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            
            // number
            
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            System.out.println();
            space -= 2;
        }
    }
    

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = s.nextInt();
        Pattern12 p = new Pattern12();
        p.Pattern(n);
        s.close();
    }
}
