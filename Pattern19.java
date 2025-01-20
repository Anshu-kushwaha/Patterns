import java.util.Scanner;

public class Pattern19 {
    void Pattern(int n){
        int iniS = 0;
        for (int i = 0; i < n; i++) {
            //  stars
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            // space
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            //  stars
            for (int j = 1; j <= n - i; j++){
                System.out.print("*");
            }
            iniS += 2;
            System.out.println();
        }
        iniS = (2 * n - 2);
        for (int i = 1; i <n ; i++) {
            // stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // space
            for (int j = 0; j < iniS; j++) {
                System.out.print(" ");
            }
            //  stars
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            iniS -= 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the no. of rows: ");
        int n = sc.nextInt();
        Pattern19 p = new Pattern19();
        p.Pattern(n);
        sc.close();
    }
}
