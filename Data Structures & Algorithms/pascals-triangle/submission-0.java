class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<Integer> row1 = new ArrayList<>(List.of(1));
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> currentRow = row1;
            result.add(row1);
        for (int i = 2; i <= numRows ; i++) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(1);
            for (int j = 0; j < currentRow.size() - 1; j++) {
                tmp.add(currentRow.get(j) + currentRow.get(j + 1));
            }
            tmp.add(1);
            result.add(tmp);
            currentRow = tmp;
        }
        return result;
    }
}