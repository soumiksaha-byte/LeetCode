class Solution {
    public int minOperations(int[][] grid, int x) {
        int ops=0;
        ArrayList<Integer>ans= new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[i].length;j++){
                ans.add(grid[i][j]);
            }
        }
        Collections.sort(ans);
        int rem=ans.get(0)%x;
        for(Integer m:ans){
            if(rem!=m%x){
            return -1;
            }
        }
        int target=ans.get(ans.size()/2);
        for(Integer c:ans){
            ops+=Math.abs(c-target)/x;
        }
        return ops;
    }
}
