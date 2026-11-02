class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> ans = new ArrayList<>();

        for(int row = 0; row <= rowIndex; row++) {
            List<Integer> list = new ArrayList<>();

            list.add(1);

            if(row > 0) {
                List<Integer> prev = ans.get(row - 1);

                for(int i = 1; i < prev.size(); i++) {
                    list.add(prev.get(i - 1) + prev.get(i));
                }

                list.add(1);
            }

            ans.add(list);
        }

        return ans.get(rowIndex);
    }
}
