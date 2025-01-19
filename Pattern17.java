import java.util.Scanner;

public class Pattern17 {
    void Pattern(int n) {

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }
            // characters
            char ch = 'A';
            int breakpoint = (2*i+1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        Pattern17 p = new Pattern17();
        p.Pattern(n);
        s.close();
    }
}