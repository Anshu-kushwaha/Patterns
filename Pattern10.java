import java.util.Scanner;

public class Pattern10 {

    void Pattern(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i-1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }   
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no of rows: ");
        int n = s.nextInt();
        Pattern10 p = new Pattern10();
        p.Pattern(n);
        s.close();
    }
}