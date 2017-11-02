package com.azurada;

public class Solution {

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {2, 3, 1, 5};
        assert s.solution(A) == 4;
        int[] B = {5, 6, 1, 2, 4};
        assert s.solution(B) == 3;
    }

    public int solution(int[] A) {
        int sumOfArrayWithMissingEl = 0, sumOfCompleteArray = 0;
        for (int i = 0; i < A.length; i++) {
            sumOfArrayWithMissingEl += A[i];
            sumOfCompleteArray += i + 1;
        }
        sumOfCompleteArray += A.length + 1;
        return sumOfCompleteArray - sumOfArrayWithMissingEl;
    }
}
