class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int i = 0;
        int j = 0;
        while (i <= word.length() - 1 && j <= abbr.length() - 1) {
            if (Character.isLetter(abbr.charAt(j))) {
                if (word.charAt(i) != abbr.charAt(j)) return false;
                i++;
                j++;
            }else {
                String length = "";
                int cnt = 0;
                while (j < abbr.length() && Character.isDigit(abbr.charAt(j))) {
                    if (cnt == 0 && abbr.charAt(j) == '0') {
                        return false;
                    }
                    char c = abbr.charAt(j);
                    length += String.valueOf(c);
                    j++;
                    cnt++;
                    
                }
                int lengthValue = Integer.parseInt(length);
                i = i + lengthValue;
                // if (i > word.length() - 1) return false
            }
        }
        if (i > word.length() - 1 && j <= abbr.length() - 1) return false;
        if (i <= word.length() - 1 && j > abbr.length() - 1) return false;
        return i == word.length() && j == abbr.length();
    }
}