package Lesson7_Stonewall미완.Fish;

import java.util.Stack;

public class Solution {
    public static int solution(int[] A, int[] B) {
        int answer = 0;
        int N = A.length;
        Stack<Integer> downStream = new Stack<>();

        for (int i = 0; i < N; i++) {
            if (B[i] == 0) {
                if (downStream.isEmpty())
                    answer++;
                else {
                    while (!downStream.isEmpty() && downStream.peek() < A[i]) {
                        downStream.pop();
                    }
                    if (downStream.isEmpty())
                        answer++;
                }
            } else if (B[i] == 1) {
                downStream.push(A[i]);
            }
        }

        return answer + downStream.size();
    }

    /**
     * A [0] = 4 B [0] = 0
     * A [1] = 3 B [1] = 1
     * A [2] = 2 B [2] = 0
     * A [3] = 1 B [3] = 0
     * A [4] = 5 B [4] = 1
     * A [5] = 6 B [5] = 0
     */

    public static void main(String[] args) {
        int[] A = {4, 3, 2, 1, 5};
        int[] B = {0, 1, 0, 0, 0};
        System.out.println(solution(A, B));
    }
}
