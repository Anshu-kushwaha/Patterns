import java.util.Scanner;

public class Pattern18 {
    void Pattern(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('E' - i); ch <= 'E'; ch++) {
                System.out.print(ch +  " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of rows: ");
        int n = sc.nextInt();
        Pattern18 p = new Pattern18();
        p.Pattern(n);
        sc.close();
    }
}
