class Solution {

    public int leastInterval(char[] tasks, int n) {
        int[] cnt = new int[26];
        for (int i = 0; i < tasks.length; i++) {
            cnt[tasks[i] - 'A']++;
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
        
        for (int value : cnt) {
            if (value > 0) {
                pq.offer(value);
            }
        }

        Queue<int[]> q = new LinkedList<>();
        int time = 0;
        while (!pq.isEmpty() || !q.isEmpty()) {
            time++;
            if (pq.isEmpty() && !q.isEmpty()) {
                time = q.peek()[1];
            }
            if (!q.isEmpty() && time == q.peek()[1]) {
                pq.offer(q.poll()[0]);
            }
            int value = pq.poll() - 1;
            if (value > 0) {
                q.add(new int[]{value, time + n + 1});
            }
            
        }
        return time;
    }
}
