class Solution {
    public int solution(int[][] sizes) {
        int max1 = 0;
        int max2 = 0;

        for(int[] size : sizes) {
            max1 = Math.max(max1, Math.max(size[0], size[1]));
            max2 = Math.max(max2, Math.min(size[0], size[1]));
        }

        return max1 * max2;
    }
}