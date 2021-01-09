package Lesson4.PermCheck;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        if (A.length == 0)
            return 0;

        if (A.length == 1) {
            if (A[0] == 1) {
                return 1;
            } else
                return 0;
        }

        Arrays.sort(A);
        int n = A[0];

        if (n != 1)
            return 0;

        for (int i = 1; i < A.length; i++) {
            if (A[i] - n != 1) {
                return 0;
            }
            n = A[i];
        }

        return 1;
    }

    public static void main(String[] args) {
        int[] a = {2, 3};
        System.out.println(solution(a));
    }
}
