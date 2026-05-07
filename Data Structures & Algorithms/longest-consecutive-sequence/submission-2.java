class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        int longest = 0;
        for (Integer n : set) {
            if (!set.contains(n - 1)) {
                int length = 1;
                int tmp = n;
                while (set.contains(tmp + 1)) {
                    length++;
                    tmp++;
                }
                longest = Math.max(longest, length);
            }
        }
        return longest;

    }
}
