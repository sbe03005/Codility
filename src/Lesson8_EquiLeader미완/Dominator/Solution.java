package Lesson8_EquiLeader미완.Dominator;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static int solution(int[] A) {
        int answer = -1;
        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);

            if (!(hm.get(A[i]) < A.length / 2 + 1)) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static int solution2(int[] A) {
        int answer = -1;
        Map<Integer, Integer> hm = new HashMap<>();

        int size = 0;
        if (A.length % 2 == 1) {
            size = A.length / 2 + 1;
        } else {
            size = A.length / 2;
        }

        for (int i = 0; i < A.length; i++) {
            hm.put(A[i], hm.getOrDefault(A[i], 0) + 1);

            if (hm.get(A[i]) >= size) {
                answer = i;
                break;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {3, 4, 3, 2, 3, -1, 3, 3};
        int[] a1 = {0, 0, 1, 1, 1};
        int[] a2 = {2, 1, 1, 4};
        System.out.println(solution(a2));
    }
}
