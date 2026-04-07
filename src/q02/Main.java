        // TODO: Print Pascal's Triangle for n rows
        //       Values on each row separated by single space
        //       No leading or trailing spaces
        //
        // Input: 5
        // Output:
        // 1
        // 1 1
        // 1 2 1
        // 1 3 3 1
        // 1 4 6 4 1
import java.util.Scanner;

public class PascalTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // Number of rows
        sc.close();

        for (int i = 0; i < n; i++) {
            int val = 1;  // First element of each row is 1
            for (int j = 0; j <= i; j++) {
                System.out.print(val);
                if (j < i) {
                    System.out.print(" ");  // Separate values by single space
                }
                val = val * (i - j) / (j + 1);  // Compute next value in row
            }
            System.out.println();  // Move to next row
        }
    }
}
