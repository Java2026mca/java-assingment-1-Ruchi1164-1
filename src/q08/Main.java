   // TODO: Implement a stack using an array (no Java Stack class)
        //       Process n operations:
        //         PUSH x  → push integer x
        //         POP     → pop top, print it; if empty print "EMPTY"
        //         PEEK    → print top without removing; if empty print "EMPTY"
        //         SIZE    → print current number of elements
        //
        // Input:
        // 6
        // PUSH 10
        // PUSH 20
        // PEEK
        // POP
        // POP
        // POP
        //
        // Output:
        // 20
        // 20
        // 10
        // EMPTY
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        sc.nextLine(); // consume newline

        int[] stack = new int[n];
        int top = -1;

        for (int i = 0; i < n; i++) {
            String line = sc.nextLine();
            String[] parts = line.split(" ");

            String op = parts[0];

            if (op.equals("PUSH")) {
                int x = Integer.parseInt(parts[1]);
                top++;
                stack[top] = x;
            } 
            else if (op.equals("POP")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                    top--;
                }
            } 
            else if (op.equals("PEEK")) {
                if (top == -1) {
                    System.out.println("EMPTY");
                } else {
                    System.out.println(stack[top]);
                }
            } 
            else if (op.equals("SIZE")) {
                System.out.println(top + 1);
            }
        }

        sc.close();
    }
                }
