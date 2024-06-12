package algorithms;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
//        while (s.contains("()") || s.contains("{}") || s.contains("[]")) {
//            s = s.replace("()", "");
//            s = s.replace("{}", "");
//            s = s.replace("[]", "");
//        }
//        return s.isEmpty();

        Stack<Character> stack = new Stack<>();
        for (Character c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.peek();
                if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
