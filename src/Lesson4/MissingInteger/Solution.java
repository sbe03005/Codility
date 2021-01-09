package Lesson4.MissingInteger;

import java.util.*;

public class Solution {
    public static int solution(int[] A) {
        Arrays.sort(A);
        HashSet<Integer> set = new HashSet<>();
        for (int i : A) {
            if (i > 0) {
                set.add(i);
            }
        }

        System.out.println(set);

        int i;
        for (i = 1; i <= A.length; i++) {
            if (!set.contains(i)) {
                return i;
            }
        }

        return i;
    }

    public static void main(String[] args) {
        int[] a = {1, 3, 6, 4, 1, 2};
        System.out.println(solution(a));
    }
}
