class Solution {

    public String encode(List<String> strs) {
        if (strs.isEmpty()) return "";
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str.length());
            sb.append(",");
        }
        sb.append("#");
        for (String str : strs) {
            sb.append(str);
        }
        return sb.toString();
    }

    public List<String> decode(String str) {
        if (str == "") return new ArrayList<>();
        int i = 0;
        List<Integer> tmp = new ArrayList<>();
        List<String> result = new ArrayList<>();
        while (str.charAt(i) != '#') {
            StringBuilder sb = new StringBuilder();
            while(str.charAt(i) != ',') {
                sb.append(str.charAt(i));
                i++;
            }
            tmp.add(Integer.parseInt(sb.toString()));
            i++;
        }
        i++;
        for (Integer size : tmp) {
            result.add(str.substring(i, i + size));
            i = i + size;
        }
        return result;
    }
}
