class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int i = 0;
        int j = 0;
        while (i < nums.length && j < nums.length) {
           if (nums[i] != 1 || nums[j] != 1) {
            i++;
            j = i;
           }else {
            max = Math.max(max, j - i + 1);
            j++;
           }
        }
        return max;
    }
    
}