package Lesson1.Iterations;

import java.util.StringTokenizer;

public class Solution {
    public static int solution(int N) {
        String s = Integer.toBinaryString(N);
        StringTokenizer st = new StringTokenizer(s, "1");

        int answer = 0;
        int size = st.countTokens();
        if (N % 2 == 0)
            size -= 1;

        for (int i = 0; i < size; i++) {
            String t = st.nextToken();
            if (answer < t.length()) {
                answer = t.length();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(32));
    }
}
