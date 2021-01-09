package Lesson3.FrogJmp;

public class Solution {
    public static int solution(int X, int Y, int D) {
        int answer = (Y - X) / D;

        if ((Y - X) % D != 0) {
            answer += 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(10, 130, 30));
    }
}
