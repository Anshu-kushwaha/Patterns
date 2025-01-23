import java.util.Scanner;

import static java.lang.Math.min;

public class Pattern22 {
    void Pattern(int n){
        for (int i = 0; i < 2 * n - 1 ; i++) {
            for (int j = 0; j < 2 * n - 1; j++) {
                int top = i;
                int left = j;
                int right = (2 * n - 2) - j;
                int down = (2 * n - 2 ) - i;
                System.out.print(n - min(min(top, down), min(left, right)));
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        Pattern22 p = new Pattern22();
        p.Pattern(n);
    }
}
