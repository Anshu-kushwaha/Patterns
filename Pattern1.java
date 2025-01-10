import java.util.Scanner;

public class Pattern1 {

    void PrintPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        Pattern1 p = new Pattern1();
        p.PrintPattern(n); 
        s.close();
    }
}
