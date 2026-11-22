class Solution {
    public int rob(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }else if(nums.length==2){
            return Math.max(nums[0],nums[1]);
        }
       int f=nums[0];
       int s=Math.max(nums[1],nums[0]);
       int ans=0;
        for(int i=2;i<nums.length;i++){
            ans=Math.max(f+nums[i],s);
            f=s;
            s=ans;
        }
        return ans;
    }
}
