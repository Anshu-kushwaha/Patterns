import java.util.Scanner;

public class Pattern14 {
    void Pattern(int n){
        // i = 2
        // A = A + 2 -> B C so, A B C
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int n = s.nextInt();
        Pattern14 p = new Pattern14();
        p.Pattern(n);
    }
}