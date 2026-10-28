class Solution {

    // nums = {1, 4, 1, 2} n = 4
    // ans.length = 8
    // ans[2n]
    // ans = {1, 4, 1, 2, 1, 4, 1, 2};
    // ans[0] = ans[4]
    // ans[1] = ans[5]
    // go through nums array 0 -> n - 1
    // ans[i] = nums[i]
    // ans[i + n] = nums[i]

    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        System.out.println(Arrays.toString(ans));
        return ans;
    }
}