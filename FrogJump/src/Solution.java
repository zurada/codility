public class Solution {

    public int solution(int X, int Y, int D) {
        int Z = Y-X;
        return Z / D + (( Z % D == 0) ? 0 : 1);
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.solution(10, 85, 30));
    }
}
