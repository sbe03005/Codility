package Lesson6.Triangle;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        int answer = 0;
        Arrays.sort(A);

        for (int i = 2; i < A.length; i++) {
            if (((long) A[i - 2] + (long) A[i - 1]) > (long) A[i]) {
                answer++;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {2147483647, 2147483647, 2147483647};
        System.out.println(solution(a));
    }
}
