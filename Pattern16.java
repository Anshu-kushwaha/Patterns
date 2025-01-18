import java.util.Scanner;

public class Pattern16 {
    void Pattern(int n) {
        
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i ; j++) {
                System.out.print(ch + " ");
            }
            System.out.println();
            
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of lines: ");
        int n = s.nextInt();
        Pattern16 p = new Pattern16();
        p.Pattern(n);
        s.close();
    }
}