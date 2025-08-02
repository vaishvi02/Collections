package main.java.LeetCodeBlind75;

import java.util.Stack;

public class ValidParanthesis {

    public boolean checkValidParanthesis(String str) {
        Stack<Character> stack = new Stack<>();

        if (str.length() % 2 != 0)
            return false;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch == '(' || ch == '{' || ch == '[') {
                stack.push(ch);
            } else {
                if (stack.isEmpty())
                    return false;

                char top = stack.peek();

                if ((ch == ')' && top == '(') ||
                        (ch == '}' && top == '{') ||
                        (ch == ']' && top == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        System.out.println(vp.checkValidParanthesis("(]})"));
    }
}
