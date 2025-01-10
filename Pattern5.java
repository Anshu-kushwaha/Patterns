import java.util.Scanner;

public class Pattern5 {
    void Pattern(int n){
        for (int i = n; i >= 1; i--) { // Outer loop starts from n and decreases
            for (int j = 1; j <= i; j++) { // Inner loop runs 'i' times
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line after printing each row
        }
        
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int n = s.nextInt();
        Pattern5 p = new Pattern5();
        p.Pattern(n);
        s.close();        
    }
}
