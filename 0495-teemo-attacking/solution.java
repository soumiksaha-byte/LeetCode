class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {
        if(timeSeries.length==1){
            return duration;
        }
        int total=0;
        for(int i=0;i<timeSeries.length-1;i++){
            if(timeSeries[i]+duration-1>=timeSeries[i+1]){
                total=total+(timeSeries[i+1]-timeSeries[i]);
            }
            else{
                total=total+duration;
            }
        }
        total=total+duration;
        return total;
    }
}
