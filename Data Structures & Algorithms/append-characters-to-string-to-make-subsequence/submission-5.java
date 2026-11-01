class Solution {
    public int appendCharacters(String s, String t) {
        
        // i -> string t
        // j --> string s

        // t[i] == s[j] -> i++; j++;
        // t[i] != s[j] -> j++;

        // j == length(s) -> i -> length(t) - i

        // t coding
        //       i    // => 
        // s coaching
        //             j


        int i = 0;
        int j = 0;
        
        while (i < t.length() && j < s.length()) {
            if (t.charAt(i) == s.charAt(j)) {
                i++;
                j++;
            }else j++;
        }
        return t.length() - i;
    }
}