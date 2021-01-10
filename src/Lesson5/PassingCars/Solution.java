package Lesson5.PassingCars;

public class Solution {
    public static int solution(int[] A) {
        int answer = 0;

        int per = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                per += 1;
            } else
                answer += per * A[i];
        }

        if (Math.abs(answer) > 1000000000)
            answer = -1;

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {0, 1, 0, 1, 1};
        System.out.println(solution(a));
    }
}
