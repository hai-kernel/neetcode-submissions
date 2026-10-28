class Solution {

    // HashSet set 
    // go through nums
    // check whether this element had already in the set
        // yes => true
    // add all element to the set
    // return false


    public boolean hasDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) return true;
            set.add(nums[i]);
        }
        return false;
    }
}