package Lesson10.CountFactors;

public class Solution {
    public static int solution(int N) {
        int answer = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            if (N % i == 0) {
                answer++;
                if (i * i < N)
                    answer++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(24));
    }
}
