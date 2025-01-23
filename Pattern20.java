import java.util.Scanner;

public class Pattern20 {
    void Pattern(int n) {
        int spaces = 2*n-2;
        for (int i = 0; i <= 2*n-1; i++) {
            int stars = i < n ? i + 1 : 2 * n - i - 1;
            // stars
            for (int j = 0; j < stars ; j++) {
                System.out.print("*");
            }
            // space
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // star
            for (int j = 0; j < stars ; j++) {
                System.out.print("*");
            }
            System.out.println();
            spaces = i < n -1 ? spaces -2 : spaces +2;
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        Pattern20 p = new Pattern20();
        p.Pattern(n);
        s.close();
    }
}