import java.util.Scanner;

public class Pattern3{
    void Pattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "  "); 
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        Pattern3 p = new Pattern3();
        p.Pattern(n);
        s.close();
    }
}