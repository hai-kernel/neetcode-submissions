class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) return 0;
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        int[] arr = new int[set.size()];
        int j = 0;
        for (Integer num : set) {
            arr[j++] = num;
        }
        Arrays.sort(arr);
        List<List<Integer>> result = new ArrayList<>();
        int index = 0;
        List<Integer> firstList = new ArrayList<>();
        firstList.add(arr[0]);
        result.add(firstList);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] - arr[i - 1] == 1) {
                result.get(index).add(arr[i]);
            }else {
                index++;
                List<Integer> newList = new ArrayList<>();
                newList.add(arr[i]);
                result.add(newList);
            }
        }
        result.sort((a, b) -> b.size() - a.size());
        return result.get(0).size();
    }
}
