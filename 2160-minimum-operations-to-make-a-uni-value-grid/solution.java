class Solution {
    public int minOperations(int[][] grid, int x) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                list.add(grid[i][j]);
            }
        }
        int rem=list.get(0)%x;
        for(Integer n:list){
            if(rem!=n%x){
                return -1;
            }
        }
        Collections.sort(list);
        int target=list.get((list.size()-1)/2);
        int count=0;
        for(Integer m:list){
            count+=Math.abs(m-target)/x;
        }
        return count;
    }
}
