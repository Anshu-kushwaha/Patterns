import java.util.Scanner;

public class Pattern15 {

    void Pattern(int n) {
        // i = 2
        // A = A + 2 -> B C so, A B C

        for (int i = n; i >= 1; i--) {
            for (char ch = 'A'; ch < 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = s.nextInt();
        Pattern15 p = new Pattern15();
        p.Pattern(n);
    }
}
