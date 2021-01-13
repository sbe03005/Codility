package Lesson9_MaxDouble미완.MaxSliceSum;

public class Solution {
    public static int solution(int[] A) {
        int max = A[0];
        int sum = A[0];

        // 3, 2, -6, 4, 0
        for (int i = 1; i < A.length; i++) {
            sum = Math.max(A[i], sum + A[i]);
            max = Math.max(sum, max);
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {3, 2, -6, 4, 0};
        System.out.println(solution(a));
    }
}
