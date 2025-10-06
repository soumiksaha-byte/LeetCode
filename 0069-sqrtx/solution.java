class Solution {
    public int mySqrt(int x) {
        if(x==0 || x==1){
            return x;
        }
        int left=0;
        int right=x/2;
        int mid=0;
        int ans=0;
        while(left<=right){
            mid=left + (right - left) / 2;
            long sq = (long) mid * mid;
            if(sq==x){
                return mid;
            }
            if(sq<x){
                ans = mid;
                left=mid+1;
            }else{
                right=mid-1;
            }
        }
        return ans;
    }
}
