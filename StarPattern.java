import java.util.Scanner;

public class StarPattern {

    void Pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        StarPattern p = new StarPattern();
        p.Pattern(n);
        s.close();
    }
}
