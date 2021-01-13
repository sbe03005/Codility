package Lesson6.MaxProductOfThree;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        Arrays.sort(A);
        int i = A.length;

        if ((A[0] * A[1] * A[i - 1]) > A[i - 1] * A[i - 2] * A[i - 3])
            return A[0] * A[1] * A[i - 1];
        else
            return A[i - 1] * A[i - 2] * A[i - 3];
    }

    public static void main(String[] args) {
        int[] a = {-3, 1, 2, -2, 5, 6};
        System.out.println(solution(a));
    }
}
