class Solution {
    public int maxProfit(int[] prices) {
        int max=Integer.MIN_VALUE;
        int minValue=prices[0];
        for(int i=0;i<prices.length;i++){
            if(minValue>prices[i]){
                minValue=prices[i];
            }
            max=Math.max(max,prices[i]-minValue);
        }
        return max;
    }
}
