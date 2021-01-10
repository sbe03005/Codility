package Lesson5.CountDiv;

public class Solution {
    // 6 7 8 9 10 11
    public static int solution(int A, int B, int K) {
        int solve = B / K - A / K;
        solve += A % K == 0 ? 1 : 0;
        return solve;
    }

    public static int solution2(int A, int B, int K) {
        if (A == B) {
            if (A % K == 0)
                return 1;
            else
                return 0;
        }
        if ((B - A) == K) {
            if (A == 0)
                return 2;
            return 1;
        }

        int a = A / K;
        if (A % K == 0)
            a--;
        int b = B / K;

        return b - a;
    }

    // 123456688
    public static void main(String[] args) {
        System.out.println(solution(0, 2000000000, 2000000000));
    }
}
