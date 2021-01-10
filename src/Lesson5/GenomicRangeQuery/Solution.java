package Lesson5.GenomicRangeQuery;

class Solution {
    public static int[] solution(String S, int[] P, int[] Q) {
        int[] A = new int[S.length() + 1];
        int[] C = new int[S.length() + 1];
        int[] G = new int[S.length() + 1];

        char[] chars = S.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            switch (chars[i]) {
                case 'A':
                    A[i + 1]++;
                    break;
                case 'C':
                    C[i + 1]++;
                    break;
                case 'G':
                    G[i + 1]++;
                    break;
                default:
                    break;
            }

            A[i + 1] += A[i];
            C[i + 1] += C[i];
            G[i + 1] += G[i];
        }

        int[] answer = new int[P.length];

        System.out.print(0 + " ");
        for (char c : S.toCharArray()) {
            System.out.print(c + " ");
        }
        System.out.println();
        for (int i : A) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : C) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : G) {
            System.out.print(i + " ");
        }
        System.out.println();

        for (int i = 0; i < answer.length; i++) {
            int startIndex = P[i];
            int endIndex = Q[i];

            if (startIndex == endIndex) {
                char c = S.charAt(startIndex);

                switch (c) {
                    case 'A':
                        answer[i] = 1;
                        break;
                    case 'C':
                        answer[i] = 2;
                        break;
                    case 'G':
                        answer[i] = 3;
                        break;
                    case 'T':
                        answer[i] = 4;
                        break;
                } // 2 4 CAGCCTA
            } else if (A[startIndex] != A[endIndex + 1]) {
                answer[i] = 1;
            } else if (C[startIndex] != C[endIndex + 1]) {
                answer[i] = 2;
            } else if (G[startIndex] != G[endIndex + 1]) {
                answer[i] = 3;
            } else {
                answer[i] = 4;
            }
        }

        return answer;
    }

    public static int[] solution2(String S, int[] P, int[] Q) {
        int[] R = new int[P.length];

        int M = P.length;
        for (int i = 0; i < M; i++) {
            String tmp = S.substring(P[i], Q[i] + 1);
            if (tmp.contains("A")) {
                R[i] = 1;
            } else if (tmp.contains("C")) {
                R[i] = 2;
            } else if (tmp.contains("G")) {
                R[i] = 3;
            } else {
                R[i] = 4;
            }
        }

        return R;
    }

    public static void main(String[] args) {
        int[] P = {2, 5, 0};
        int[] Q = {4, 5, 6};

        int[] arr = solution("CAGCCTA", P, Q);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}
