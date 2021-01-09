package Lesson3.PermMissingElem;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        Arrays.sort(A);

        // 비어있을 때
        if (A.length == 0) {
            return 1;
        }

        // 첫번째, 마지막 요소 비어있을 때
        if (A[0] != 1)
            return 1;
        if (A[A.length - 1] != A.length + 1)
            return A.length + 1;

        int answer = 0;
        for (int i = 1; i < A.length; i++) {
            if (A[i] - A[i - 1] > 1) {
                answer = A[i] - 1;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2, 3};
        System.out.println(solution(a));
    }
}
