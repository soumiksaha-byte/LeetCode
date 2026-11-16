class Solution {
    public int minGroups(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->Integer.compare(a[0],b[0]));
        PriorityQueue<Integer> pq= new PriorityQueue<>();
        pq.offer(intervals[0][1]);
        int count=0;
        for(int i=1;i<intervals.length;i++){
            int current=intervals[i][0];
            int current_end=intervals[i][1];
            if(pq.peek()<current){
                pq.poll();
            }
            pq.offer(current_end);
        }    
        return pq.size();
    }
}
