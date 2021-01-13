package Lesson6.NumberOfDiscIntersections;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        int N = A.length;
        long[] lower = new long[N];
        long[] upper = new long[N];

        for (int i = 0; i < N; i++) {
            lower[i] = i - (long) A[i];
            upper[i] = i + (long) A[i];
        }

        Arrays.sort(lower);
        Arrays.sort(upper);

        int intersection = 0;
        int j = 0;

        for (int i = 0; i < N; i++) {
            while (j < N && upper[i] >= lower[j]) {
                intersection += j;
                intersection -= i; // upper[i]가 두번 세지는 것을 빼줌
                j++;
            }
        }

        if (intersection > 10000000) return -1;
        return intersection;
    }

    public static int solution2(int[] A) {
        int answer = 0;

        for (int i = 0; i < A.length; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if ((i + A[i]) > (j - A[j])) {
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1, 5, 2, 1, 4, 0};
        System.out.println(solution(a));
    }
}
