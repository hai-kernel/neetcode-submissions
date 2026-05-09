class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b, a));
        for (int i = 0; i < stones.length; i++) {
            pq.offer(stones[i]);
        }
        while (!pq.isEmpty()) {
            if (pq.size() == 1) return pq.poll();
            int max = pq.poll();
            int min = pq.poll();
            if (max != min) {
                pq.offer(max - min);
            }
            
        }
        return 0;
    }
}
