package Lesson2.CyclicRotation;

import java.util.Arrays;

public class Solution {
    public static int[] solution(int[] A, int K) {
        if (A.length == 0)
            return A;

        int[] answer = new int[A.length];

        if (K > A.length)
            K %= A.length;

        int[] sub1 = Arrays.copyOfRange(A, A.length - K, A.length);
        int[] sub2 = Arrays.copyOfRange(A, 0, A.length - K);

        System.arraycopy(sub1, 0, answer, 0, sub1.length);
        System.arraycopy(sub2, 0, answer, sub1.length, sub2.length);

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {};
        a = solution(a, 8);
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
