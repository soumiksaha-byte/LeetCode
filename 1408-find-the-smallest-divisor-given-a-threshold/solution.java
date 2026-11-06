class Solution {
    public int smallestDivisor(int[] nums, int threshold) {
        int i=1;
        int end=0;
        for(int n:nums){
            end = Math.max(end,n);
        }
        int j=end;
        int ans=-1;
        int sum=0;
        int max=0;
        while(i<=j){
            int mid=(i+j)/2;
            sum=0;
            for(int num:nums){
                sum+=(num + mid - 1) / mid;
            }
            if(sum>threshold){
                i=mid+1;
            }else{
                max=mid;
                j=mid-1;
            }
        }
            return max;
    }
}
