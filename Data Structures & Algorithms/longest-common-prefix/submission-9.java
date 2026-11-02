class Solution {
    public String longestCommonPrefix(String[] strs) {
        String minStr = strs[0];
        for (String str : strs) {
            if (minStr.length() > str.length()) minStr = str;
        }

        if (minStr.isEmpty()) return minStr;

        int minIndex = 202;
        for (String str : strs) {
            for (int i = 0; i < minStr.length(); i++) {
                if (minStr.charAt(i) != str.charAt(i)) {
                    minIndex = Math.min(minIndex, i - 1);
                }
                if (i == minStr.length() - 1) minIndex = Math.min(minIndex, i);
            }
        }


        
        if (minIndex < 0) return "";
        return minStr.substring(0, minIndex + 1);


    }


}