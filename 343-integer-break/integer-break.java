class Solution {
    public int integerBreak(int n) {
        if(n==1){
            return 0;
        }
        if(n==2){
            return 1;
        }
        int[]dp=new int[n+1];
        dp[1]=0;
        dp[2]=1;
        for(int i=3;i<dp.length;i++){
            int j=1;
            while(j<=i-1){
                dp[i]=Math.max(dp[i],j*Math.max(i-j,dp[i-j]));
                j++;
            }
        }
        return dp[n];
    }
}