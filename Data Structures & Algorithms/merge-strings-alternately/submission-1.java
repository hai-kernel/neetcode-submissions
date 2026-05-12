class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        String re = "";
        while (i < word1.length() || j < word2.length()) {
            if (i < word1.length()) {
                re += String.valueOf(word1.charAt(i));
                i++;
            }

            if (j < word2.length()) {
                re += String.valueOf(word2.charAt(j));
                j++;
            }
        }
        return re;
    }
}