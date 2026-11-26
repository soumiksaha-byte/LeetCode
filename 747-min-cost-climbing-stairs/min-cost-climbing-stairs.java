class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f=0;
        int s=0;
        int ans=0;
        for(int i=2;i<cost.length+1;i++){
            ans=Math.min(s+cost[i-1],f+cost[i-2]);
            f=s;
            s=ans;
        }
        return s;

    }
}