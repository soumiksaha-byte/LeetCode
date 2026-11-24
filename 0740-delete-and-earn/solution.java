class Solution {
    public int deleteAndEarn(int[] nums) {
        int max=0;
        for(int n:nums){
            max=Math.max(n,max);
        }
        int[]points=new int[max+1];
        for(int x:nums){
            points[x]+=x;
        }
        int f=points[0];
        int s=Math.max(points[0],points[1]);
        int ans=0;
        for(int i=2;i<points.length;i++){
            ans=Math.max(s,f+points[i]);
            f=s;
            s=ans;
        }
        return s;
    }
}
