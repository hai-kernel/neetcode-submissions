class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, List<Integer>> map = new HashMap<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            map.putIfAbsent(nums[i], new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int third = (-1) * (nums[i] + nums[j]);
                if (map.containsKey(third)) {
                    if (map.get(third).size() == 2 && map.get(third).contains(i) && 
                    map.get(third).contains(j)
                    ) {
                        continue;
                    }
                    if (map.get(third).size() < 2 && (map.get(third).contains(i) ||
                    map.get(third).contains(j))
                    ) {
                        continue;
                    }
                    List<Integer> tmp = new ArrayList<>(Arrays.asList(third, nums[i], nums[j]));
                    tmp.sort((a, b) -> a - b);
                    set.add(tmp);
                }
            }
        }
        
        List<List<Integer>> res = new ArrayList<>(set);

        res.sort((a, b) -> {
            for (int i = 0; i < 3; i++) {
                int cmp = Integer.compare(a.get(i), b.get(i));
                if (cmp != 0) return cmp;
            }
            return 0;
        });

        return res;
    }
}
