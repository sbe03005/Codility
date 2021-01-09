package Lesson4.FrogRiverOne;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    // 유틸 잘 활용하자
    public static int solution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i = 1; i <= X; i++) {
            set.add(i);
        }

        for (int i = 0; i < A.length; i++) {
            set.remove(A[i]);

            if (set.size() == 0)
                return i;
        }

        return -1;
    }

    // 시간 초과
    public static int solution2(int X, int[] A) {
        int answer = 0;
        int max = Integer.MIN_VALUE;
        for (int i = 1; i <= X; i++) {
            boolean check = false;
            for (int j = 0; j < A.length; j++) {
                if (A[j] == i) {
                    if (max < j)
                        max = j;
                    check = true;
                    break;
                }
            }
            if (!check)
                return -1;
        }

        return max;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 1, 4, 2, 3, 5, 4};
        int[] b = {1, 3, 2, 4, 2};
        System.out.println(solution(3, b));
    }
}
