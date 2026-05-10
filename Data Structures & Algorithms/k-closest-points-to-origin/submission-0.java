class Solution {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pq = new PriorityQueue<>(
            (a, b) -> {
                return Double.compare(Math.pow(b[0], 2) + Math.pow(b[1], 2), Math.pow(a[0], 2) + Math.pow(a[1], 2));
            }
        );
        for (int i = 0; i < points.length; i++) {
            pq.offer(points[i]);
            if (pq.size() > k) pq.poll();
        }

        int[][] re = new int[pq.size()][];
        int i = 0;
        while (!pq.isEmpty()) {
            re[i++] = pq.poll();
        }
        return re;

    }
}
