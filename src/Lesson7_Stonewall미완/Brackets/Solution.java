package Lesson7_Stonewall미완.Brackets;

import java.util.Stack;

public class Solution {
    public int solution(String S) {
        int answer = 0;
        Stack<Character> stack = new Stack<>();
        char[] cs = S.toCharArray();

        for (int i = 0; i < cs.length; i++) {
            char c = cs[i];
            if (stack.isEmpty()) {
                stack.push(c);
                continue;
            }

            if (c == ')' && stack.peek() == '(')
                stack.pop();
            else if (c == '}' && stack.peek() == '{')
                stack.pop();
            else if (c == ']' && stack.peek() == '[')
                stack.pop();
            else
                stack.push(c);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {

    }
}
