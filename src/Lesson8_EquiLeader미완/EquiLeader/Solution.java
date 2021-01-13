package Lesson8_EquiLeader미완.EquiLeader;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    // https://lipcoder.tistory.com/entry/EquiLeader-Codility
    public static int solution(int[] A) {
        int leader = -1;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);

            if (!(hm.get(A[i]) < A.length / 2 + 1)) {
                leader = A[i];
                break;
            }
        }

        boolean check = true;
        int firstIndex = Integer.MIN_VALUE;
        int lastIndex = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == leader) {
                lastIndex = i;
                if (check) {
                    firstIndex = i;
                    check = false;
                }
            }
        }



        return (lastIndex - firstIndex) / 2;
    }

    public static void main(String[] args) {
        int[] a = {4, 3, 4, 4, 4, 2};
        System.out.println(solution(a));
    }
}
