    // TODO: Evaluate a postfix (Reverse Polish Notation) expression
        //       Operands are non-negative integers, operators are: + - * /
        //       Use a stack to evaluate
        //       Input: single line, tokens separated by spaces
        //       Output: integer result
        //
        // Input: 5 1 2 + 4 * + 3 -
        // Output: 14
        //
        // Explanation: 5 + ((1+2)*4) - 3 = 5 + 12 - 3 = 14
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        int[] stack = new int[tokens.length];
        int top = -1;

        for (String t : tokens) {

            if (t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")) {

                int b = stack[top--];
                int a = stack[top--];

                int result = 0;

                if (t.equals("+")) result = a + b;
                else if (t.equals("-")) result = a - b;
                else if (t.equals("*")) result = a * b;
                else if (t.equals("/")) result = a / b;

                stack[++top] = result;

            } else {
                stack[++top] = Integer.parseInt(t);
            }
        }

        System.out.println(stack[top]);

        sc.close();
    }
}
