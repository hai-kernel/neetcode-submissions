class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> Integer.compare(b,a));

        for (int i = 0; i < gifts.length; i++) {
            pq.offer(gifts[i]);
        }

        while (k > 0) {
            pq.offer((int) Math.floor(Math.sqrt(pq.poll())));
            k--;
        }

        long sum = 0;
        while (!pq.isEmpty()) {
            sum += pq.poll();
        }

        return sum;
    }
}