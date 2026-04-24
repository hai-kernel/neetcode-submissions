class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<Integer> result = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i]) && map.get(target - nums[i]) != i) {
                return new int[]{map.get(target-nums[i]), i};
            }else {
                map.put(nums[i], i);
            }
            
        }

        return result.stream().mapToInt(i -> i).toArray();

        
    }
}
