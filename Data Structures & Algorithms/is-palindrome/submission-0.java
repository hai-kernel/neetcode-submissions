class Solution {
    public boolean isPalindrome(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (!Character.isDigit(s.charAt(i)) && !Character.isLetter(s.charAt(i))) {
                count++;
            }
        }
        char[] arr = new char[s.length() - count];
        int j = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i)) || Character.isLetter(s.charAt(i))) {
                arr[j++] = s.charAt(i);
            }
        }
        int l = 0;
        int r = arr.length - 1;
        while (l < r) {
            if (Character.toLowerCase(arr[l]) != Character.toLowerCase(arr[r])) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
