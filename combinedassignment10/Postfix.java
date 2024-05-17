package combinedassignment10;

import java.util.Scanner;
import java.util.Stack;

public class Postfix {
    
    private static int precedence(char operator) {
        switch(operator) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            case '^':
                return 3;
            default:
                return -1;
        }
    }
    
    public static String infixToPostfix(String infix) {
        StringBuilder postfix = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < infix.length(); i++) {
            char current = infix.charAt(i);
            
            if (Character.isLetterOrDigit(current)) {
                postfix.append(current);
            }
            else if (current == '(') {
                stack.push(current);
            }
            else if (current == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    postfix.append(stack.pop());
                }
                stack.pop(); 
            }
            else {
                while (!stack.isEmpty() && precedence(current) <= precedence(stack.peek())) {
                    postfix.append(stack.pop());
                }
                stack.push(current);
            }
        }
        
        while (!stack.isEmpty()) {
            postfix.append(stack.pop());
        }
        
        return postfix.toString();
    }
    
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the infix expression: ");
        String infixExpression = s.nextLine();
        
        
        System.out.println("Infix Expression: " + infixExpression);
        System.out.println("Postfix Expression: " + infixToPostfix(infixExpression));
    }
}
