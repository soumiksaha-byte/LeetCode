class Solution {
    public boolean containsDuplicate(int[] nums) {
       Arrays.sort(nums);
       int curr=nums[0];
       int count=1;
       for(int i=1;i<nums.length;i++){
        if(curr==nums[i]){
            return true;
        }
        else{
            curr=nums[i];
        }
       }
       return  false;
    }
}
