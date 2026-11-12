class Solution {
    public int splitArray(int[] nums, int k) {
        int i=0;
        int j=0;
        int ans=0;
        for(int num:nums){
            i=Math.max(i,num);
            j+=num;
        }
        while(i<=j){
            int mid=i+(j-i)/2;
            if(countSubarrays(nums,mid)<=k){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
    }
        
    private static int countSubarrays(int[] nums, int mid) {
    int count = 1;
    int sum = 0;

    for (int num : nums) {
        if(sum+num>mid){
            sum=num;
            count++;
        }else{
            sum+=num;
        }
    }

    return count;
}
}
