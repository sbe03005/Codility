package Lesson2.OddOccurrencesInArray;

import java.util.Arrays;

public class Solution {
    public static int solution(int[] A) {
        int answer = 0;

        Arrays.sort(A);

        // 3 3 7 9 9 9 9
        int i = 0;
        for (i = 0; i < A.length - 1; i += 2) {
            if (A[i] != A[i + 1]) {
                return A[i];
            }
        }

        return A[i];
    }

    public static void main(String[] args) {
        int[] a = {9, 3, 9, 3, 9, 7, 9};
        System.out.println(solution(a));
    }
}
