import java.util.Scanner;

public class Pattern13 {
    void Pattern(int n){
        int num = 1;
        for (int i = 1; i <= n; i++) {
            // number
            for (int j = 1; j <=i ; j++) {
                System.out.print(num + " ");
                num = num+1;
            }
            System.out.println();
        }
    }


    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = s.nextInt();
        Pattern13 p = new Pattern13();
        p.Pattern(n);
    }
}
