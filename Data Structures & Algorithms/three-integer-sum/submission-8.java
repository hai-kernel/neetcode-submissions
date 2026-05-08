class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> count = new HashMap<>();

        Arrays.sort(nums);

        for (int num : nums) {
            count.put(num, count.getOrDefault(num, 0) + 1);
        }

        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int third = -(nums[i] + nums[j]);

                if (!count.containsKey(third)) {
                    continue;
                }

                int need = 1;

                if (nums[i] == third) need++;
                if (nums[j] == third) need++;

                if (count.get(third) < need) {
                    continue;
                }

                List<Integer> tmp = new ArrayList<>(Arrays.asList(nums[i], nums[j], third));
                tmp.sort((a, b) -> Integer.compare(a, b));
                set.add(tmp);
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