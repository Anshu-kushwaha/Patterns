import java.util.Scanner;

public class Pattern11 {

    void Pattern(int n){
        int start = 1;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0) {
                start = 1;
            } else {
                start = 0;
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(start + " ");
                start = 1-start;
            }
            System.out.println();
           
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = s.nextInt();
        Pattern11 p = new Pattern11();
        p.Pattern(n);
        s.close();
    }
}
