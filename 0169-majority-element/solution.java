class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        int curr=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(curr==nums[i]){
                count=count+1;
                if(count>nums.length/2){
                    return curr;
                }
            }else{
                curr=nums[i];
                count=1;
            }
        }
        return curr;
}
}
