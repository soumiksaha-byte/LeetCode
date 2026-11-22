class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int f=0;
        int s=0;
        int ans=0;
        for(int i=2;i<=cost.length;i++){
            ans=Math.min(cost[i-2]+f,cost[i-1]+s);
            f=s;
            s=ans;
        }
        return ans;
    }
}
