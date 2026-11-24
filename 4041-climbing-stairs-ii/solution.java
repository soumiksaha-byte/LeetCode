class Solution {
    public int climbStairs(int n, int[] costs) {
        int []dp= new int[n+1];
        dp[0]=0;
        for(int i=1;i<=n;i++){
            int one=dp[i-1]+costs[i-1]+1;
            int two=Integer.MAX_VALUE;
            int three=Integer.MAX_VALUE;
            if(i>=2){
                two=dp[i-2]+costs[i-1]+4;
            }
            if(i>=3){
                three=dp[i-3]+costs[i-1]+9;
            }
            dp[i]=Math.min(one,Math.min(two,three));
        }
        return dp[n];
    }
}
