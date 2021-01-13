package Lesson9_MaxDouble미완.MaxProfit;

public class Solution {
    public static int solution(int[] A) {
        if (A.length == 1 || A.length == 0)
            return 0;

        int minPrice = A[0];
        int globalMaxProfit = 0;

        // 23171, 21011, 21123, 21366, 21013, 21367
        for (int i = 1; i < A.length; i++) {
            int localMaxProfit = A[i] - minPrice;
            if (minPrice > A[i])
                minPrice = A[i];

            globalMaxProfit = Math.max(localMaxProfit, globalMaxProfit);
        }

        return globalMaxProfit;
    }

    public static int solution2(int[] A) {
        int max = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (max < A[j] - A[i]) {
                    max = A[j] - A[i];
                }
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {23171, 21011, 21123, 21366, 21013, 21367};
        System.out.println(solution(a));
    }
}
