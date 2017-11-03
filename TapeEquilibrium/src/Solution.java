public class Solution {

    public int solution(int[] A) {
        int leftSum = A[0];
        int rightSum = 0;
        int minDiff = -1;

        for (int i = 1; i < A.length; i++) {
            rightSum += A[i];
        }

        for (int i = 1; i < A.length; i++) {
            int diff = Math.abs(leftSum - rightSum);
            boolean isMinNotSetYet = minDiff == -1;
            if (isMinNotSetYet) {
                minDiff = diff;
            }
            boolean isDiffSmallerThanActualMin = diff < minDiff;
            if (isDiffSmallerThanActualMin) {
                minDiff = diff;
            }
            leftSum += A[i];
            rightSum -= A[i];
        }
        return minDiff;

    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] A = {3,1,2,4,3};
        assert  s.solution(A) == 1;
        int[] B = {1,1};
        assert  s.solution(B) == 0;
    }
}
