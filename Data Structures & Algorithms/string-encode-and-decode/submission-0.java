class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        String result = "";
        for (String str : strs) {
            result += str.length() + ",";
        }
        result += "#";
        for (String str : strs) {
            result += str;
        }
        return result;
    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();
        if (str == "") return result;
        int i = 0;
        List<Integer> sizes = new ArrayList<>();
        while (str.charAt(i) != '#') {
            String size = "";
            while (str.charAt(i) != ',') {
                size += str.charAt(i);
                i++;
            }
            sizes.add(Integer.parseInt(size));
            i++;
        }
        i++;
        for (Integer size : sizes) {
            result.add(str.substring(i, i + size));
            i += size;
        }
        return result;

    }
}
