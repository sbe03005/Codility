package Lesson4.MaxCounters;

import java.util.Arrays;

public class Solution {
    public static int[] solution(int N, int[] A) {
        int[] arr = new int[N];
        int max = 0;
        int lastMax = 0;

        for (int i = 0; i < A.length; i++) {
            if (A[i] == N + 1) {
                lastMax = max; // 기록을 해놓고 나중에 한번에 다 올려버린다.
            } else {
                int idx = A[i] - 1;
                if (arr[idx] < lastMax) {
                    arr[idx] = lastMax + 1;
                } else
                    arr[idx]++;

                if (max < arr[idx]) {
                    max = arr[idx];
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.max(arr[i], lastMax);
        }

        return arr;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 4, 6, 1, 4, 4};
        int[] b = solution(5, a);

        for (int i : b) {
            System.out.print(i + " ");
        }
    }
}
