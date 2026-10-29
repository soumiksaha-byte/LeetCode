class Solution {
    public int[][] merge(int[][] intervals) {
        ArrayList<int[]> list = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        list.add(intervals[0]);
        int[]last=list.get(list.size()-1);
        int currEnd=last[1];
        for(int i=1;i<intervals.length;i++){
            if(currEnd>=intervals[i][0]){
                currEnd=Math.max(currEnd,intervals[i][1]);
                last[1]=currEnd;
            }else{
                list.add(intervals[i]);
                last=list.get(list.size()-1);
                currEnd= last[1];
            }
        } 
        int[][] arr = new int[list.size()][2];

        for (int i = 0; i < list.size(); i++) {
                    arr[i] = list.get(i);
            }

        return arr;      
    }
}
