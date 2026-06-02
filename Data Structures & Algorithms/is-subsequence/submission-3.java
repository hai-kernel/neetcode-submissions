class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length() == 0) return true;
        int j = 0;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            while (j < t.length()) {
                if (s.charAt(i) == t.charAt(j)) {
                    count++;
                    j++;
                    break;
                }
                j++;
            }
            if (count == s.length()) return true;
        }
        return false;
    }
}