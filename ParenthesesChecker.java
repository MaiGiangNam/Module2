import java.util.Stack;

public class ParenthesesChecker {
    public static boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                char left = stack.pop();
                if ((left == '(' && c != ')') || (left == '{' && c != '}') || (left == '[' && c != ']')) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String test1 = "(){}[]";
        String test2 = "({[}])";
        System.out.println(isBalanced(test1));
        System.out.println(isBalanced(test2));
    }
}
