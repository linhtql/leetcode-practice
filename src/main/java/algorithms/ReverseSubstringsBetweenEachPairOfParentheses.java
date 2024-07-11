package algorithms;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class ReverseSubstringsBetweenEachPairOfParentheses {

    public static String reverseParentheses(String s) {

        Stack<Character> stack = new Stack<>();
        Deque<Character> deque = new ArrayDeque<>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    deque.add(stack.pop());
                }

                if (!stack.isEmpty()) {
                    stack.pop();
                }

                while (!deque.isEmpty()) {
                    stack.push(deque.pollFirst());
                }
            } else {
                stack.add(s.charAt(i));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }

        return sb.reverse().toString();
    }
}
