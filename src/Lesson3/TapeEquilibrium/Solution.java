package Lesson3.TapeEquilibrium;

public class Solution {
    public static int solution(int[] A) {
        int front = A[0];
        int back = 0;
        for (int i = 1; i < A.length; i++) {
            back += A[i];
        }

        int answer = Math.abs(front - back);
        for (int i = 1; i < A.length-1; i++) {
            front += A[i];
            back -= A[i];
            if (answer > Math.abs(front - back)) {
                answer = Math.abs(front - back);
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] a = {1,1,3};
        System.out.println(solution(a));
    }
}
