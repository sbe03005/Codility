package Lesson7_Stonewall미완.Nesting;

import java.util.Stack;

public class Solution {
    public static int solution(String S) {
        char[] cs = S.toCharArray();
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < cs.length; i++) {
            if (stack.isEmpty()) {
                stack.push(cs[i]);
                continue;
            }

            if (cs[i] == ')') {
                stack.pop();
            } else
                stack.push(cs[i]);
        }

        return stack.isEmpty() ? 1 : 0;
    }

    public static void main(String[] args) {
        System.out.println(solution("(()(())()))"));
    }
}
