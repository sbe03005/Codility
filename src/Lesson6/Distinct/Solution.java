package Lesson6.Distinct;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public static int solution(int[] A) {
        Set<Integer> set = new HashSet<>();

        for (int i : A) {
            set.add(i);
        }

        return set.size();
    }

    public static void main(String[] args) {
        int [] a = {2,1,1,2,3,1};
        System.out.println(solution(a));
    }
}
