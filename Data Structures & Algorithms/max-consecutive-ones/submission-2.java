class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int j = 0;
        int max = 0;
        while (i < nums.length && j < nums.length) {
            if (nums[i] != 1) {
                i++;
                j = i;
            }else {
                if (nums[j] == 1) {
                    max = Math.max(max, j - i + 1);
                    j++;
                }else {
                    i = ++j;
                }
            }
        }
        return max;
    }
}