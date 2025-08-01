package main.java.LeetCodeBlind75;

import java.util.Stack;

public class ValidParanthesis {

    public boolean checkValidParanthesis(String str) {

        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(' || str.charAt(i) == '{' || str.charAt(i) == '[') {
                stack.push(str.charAt(i));
            } else {
                if ((!stack.isEmpty() || stack.size() != 0)) {
                    if ((str.charAt(i) == ')' && stack.peek().equals('(')) ||
                            (str.charAt(i) == '}' && stack.peek().equals('{')) ||
                            (str.charAt(i) == ']') && stack.peek().equals('[')) {

                        {
                            stack.pop();
                        }
                    }
                } else
                    return false;
            }
        }
        return stack.empty();
    }

    public static void main(String[] args) {
        ValidParanthesis vp = new ValidParanthesis();
        System.out.println(vp.checkValidParanthesis("(]})"));
    }
}
