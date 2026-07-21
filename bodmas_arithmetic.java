// Write a program that evaluates a valid arithmetic expression string.

// The expression may contain:

// integers (including 2-digit and multi-digit numbers)
// operators + − * / (also include unary minus)
// parentheses
// spaces
// Follow standard C operator precedence rules.

// Example:

// Input: 12 + 3 * 10
// Output: 42
// Example:

// Input: -2+2+2
// Output: 2

import java.util.Stack;

public class ExpressionEvaluator {

    public static int evaluate(String expression) {
        // Remove all spaces for easier parsing
        expression = expression.replaceAll("\\s+", "");
        
        Stack<Integer> values = new Stack<>();
        Stack<Character> ops = new Stack<>();
        
        // Track if a minus sign is unary (comes at start or after an operator/parenthesis)
        boolean isUnary = true;

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            // 1. Process Multi-digit Numbers
            if (Character.isDigit(c)) {
                int val = 0;
                while (i < expression.length() && Character.isDigit(expression.charAt(i))) {
                    val = val * 10 + (expression.charAt(i) - '0');
                    i++;
                }
                i--; // Step back to counter loop increment
                values.push(val);
                isUnary = false; // Next minus cannot be unary
            } 
            // 2. Process Opening Parenthesis
            else if (c == '(') {
                ops.push(c);
                isUnary = true; // Next minus inside could be unary
            } 
            // 3. Process Closing Parenthesis
            else if (c == ')') {
                while (!ops.isEmpty() && ops.peek() != '(') {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.pop(); // Remove '('
                isUnary = false; 
            } 
            // 4. Process Operators (+, -, *, /)
            else if (c == '+' || c == '-' || c == '*' || c == '/') {
                // Handle Unary Minus
                if (c == '-' && isUnary) {
                    // Unary minus is simulated by pushing 0 before the minus
                    values.push(0); 
                }

                // Process higher precedence operators first
                while (!ops.isEmpty() && hasPrecedence(c, ops.peek())) {
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }
                ops.push(c);
                isUnary = true; // After an operator, the next minus is unary
            }
        }

        // Apply remaining operators
        while (!ops.isEmpty()) {
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        return values.pop();
    }

    // Returns true if 'op2' has higher or equal precedence than 'op1'
    static boolean hasPrecedence(char op1, char op2) {
        if (op2 == '(' || op2 == ')') {
            return false;
        }
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) {
            return false;
        }
        return true;
    }

    // Performs arithmetic operation
    static int applyOp(char op, int b, int a) {
        switch (op) {
            case '+': return a + b;
            case '-': return a - b;
            case '*': return a * b;
            case '/': 
                if (b == 0) throw new UnsupportedOperationException("Cannot divide by zero");
                return a / b;
        }
        return 0;
    }

    public static void main(String[] args) {
        System.out.println(evaluate("12 + 3 * 10"));       // Output: 42
        System.out.println(evaluate("2 * (5 + (3 * 2))")); // Output: 22
        System.out.println(evaluate("-5 + 10 * 2"));      // Output: 15 (Unary minus)
        System.out.println(evaluate("10 / 2 - 3"));        // Output: 2
    }
}
