package Lesson7_Stonewall미완.StoneWall;

import java.util.Stack;

class Solution {
    public static int solution(int[] H) {
        Stack<Integer> stack = new Stack<>();
        int blockCnt = 0;

        for (int i = 0; i < H.length; i++) {
            while (stack.size() > 0 && stack.peek() > H[i]) {
                stack.pop();
            }

            if (stack.size() == 0 || stack.peek() < H[i]) {
                stack.push(H[i]);
                blockCnt++;
            }
        }

        return blockCnt;
    }

    public static void main(String[] args) {
        int[] a = {8, 8, 5, 7, 9, 8, 7, 4, 8};
        System.out.println(solution(a));
    }
}
