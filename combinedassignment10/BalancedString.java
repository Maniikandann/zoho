package combinedassignment10;

import java.util.Scanner;
import java.util.Stack;

public class BalancedString {
	public static boolean isBalance(String str) {
		Stack<Character> stack = new Stack<>();

		for (char ch : str.toCharArray()) {
			if (ch == '(' || ch == '[' || ch == '{') {
				stack.push(ch);
			} else if (ch == ')' || ch == ']' || ch == '}') {
				if (stack.isEmpty() || !isMatchPair(stack.pop(), ch)) {
					return false;
				}
			}
		}

		return stack.isEmpty();
	}

	private static boolean isMatchPair(char open, char close) {
		return (open == '(' && close == ')') || (open == '[' && close == ']') || (open == '{' && close == '}');
	}

	public static void main(String[] args) {
		System.out.println("Enter the Paranthesis:");
		Scanner s = new Scanner(System.in);
		String str = s.next();

		System.out.println(str + " is balanced: " + isBalance(str));
		s.close();

	}
}
