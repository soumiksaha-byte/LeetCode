class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list= new ArrayList<>();
        boolean flag=false;
        for(int i=0;i<intervals.length;i++){
            if(newInterval[0]>intervals[i][1]){
                list.add(intervals[i]);
            }else if(newInterval[0] <= intervals[i][1] && newInterval[1] >= intervals[i][0]){
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }else{
                if(!flag){
                    list.add(newInterval);
                    flag=true;
                }
                list.add(intervals[i]);
            }
        }
         if(!flag){
                    list.add(newInterval);
                    flag=true;
                }
        
        return list.toArray(new int[list.size()][]);
        
    }
}
