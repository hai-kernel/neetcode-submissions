class Solution {
    public List<String> stringMatching(String[] words) {
        Set<String> set = new HashSet<>();
        for (int i = 0; i < words.length - 1; i++) {
            if (set.contains(words[i])) continue;
            for (int j = i + 1; j < words.length; j++) {
                if (set.contains(words[j])) continue;
                if (words[j].length() >= words[i].length() && words[j].contains(words[i])) set.add(words[i]);
                else if (words[j].length() < words[i].length() && words[i].contains(words[j])) set.add(words[j]);
            }
        }
        return new ArrayList<>(set);
    }
}