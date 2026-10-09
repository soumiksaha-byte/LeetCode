class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]= new int[nums.length];
        int prefix[]=new int[nums.length];
        int suffix[]=new int[nums.length];
        int curr=1;
        for(int i=0;i<nums.length;i++){
            prefix[i]=curr;
            curr=curr*nums[i];
        }
        curr=1;
        for(int j=nums.length-1;j>=0;j--){
            suffix[j]=curr;
            curr=curr*nums[j];
        }
        for(int m=0;m<nums.length;m++){
            ans[m]=prefix[m]*suffix[m];
        }

        return ans;
    }
}
