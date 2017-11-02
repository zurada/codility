package com.azurada;

import java.util.Arrays;

class Solution {

    public static void main(String[] args) {
        int[] A = {1, 2, 3, 4, 5};
        int K = 2;
        Solution s = new Solution();
        System.out.println(Arrays.toString(s.solution(A, K)));
        int[] B = {100};
        K = 2;
        System.out.println(Arrays.toString(s.solution(B, K)));

    }

    public int[] solution(int[] A, int K) {
        int[] shiftedA = new int[A.length];

        for (int oldIndex = 0; oldIndex < A.length; oldIndex++) {
            int newIndex = (oldIndex + K) % A.length;
            shiftedA[newIndex] = A[oldIndex];
        }
        return shiftedA;
    }
}
