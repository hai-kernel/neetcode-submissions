class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 1) return strs[0];
        PriorityQueue<String> pq = new PriorityQueue<>(
            (a, b) -> b.length() - a.length()
        );
        for (int i = 0; i < strs.length; i++) {
            pq.offer(strs[i]);
            if (pq.size() > 2) pq.poll();
        }
        String min2 = pq.poll();
        String min1 = pq.poll();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < min1.length(); i++) {
            if (min1.charAt(i) == min2.charAt(i)) sb.append(min1.charAt(i));
            else break;
        }
        return sb.toString();
    }
}