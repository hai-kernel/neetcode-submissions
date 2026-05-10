class Solution {

    public class Node {
        int index;
        int value;

        Node(int index, int value) {
            this.index = index;
            this.value = value;
        }

    }

    public int[] getFinalState(int[] nums, int k, int multiplier) {
        PriorityQueue<Node> pq = new PriorityQueue<>(
            (a, b) -> {
                if (a.value != b.value) return Integer.compare(a.value, b.value);
                return Integer.compare(a.index, b.index);
            }
        );

        for (int i = 0; i < nums.length; i++) {
            pq.offer(new Node(i, nums[i]));
        }

        while (k > 0) {
            Node min = pq.poll();
            pq.offer(new Node(min.index, min.value * multiplier));
            k--;
        }

        while (!pq.isEmpty()) {
            Node cur = pq.poll();
            nums[cur.index] = cur.value;
        }

        return nums;
    }
}