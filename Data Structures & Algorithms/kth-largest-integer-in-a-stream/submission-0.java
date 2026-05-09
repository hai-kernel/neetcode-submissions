class KthLargest {

    int k;
    int[] nums;

    public KthLargest(int k, int[] nums) {
        this.k = k;
        this.nums = nums;
    }
    
    public int add(int val) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int i = 0; i <= nums.length; i++) {
            if (i == nums.length) {
                pq.offer(val);
            }else {
                pq.offer(nums[i]);
            }

            if (pq.size() > k) {
                pq.poll();
            }
        }
        int[] newArr = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            newArr[i] = nums[i];
        }
        newArr[nums.length] = val;
        nums = newArr;
        return pq.peek();
    }
}
