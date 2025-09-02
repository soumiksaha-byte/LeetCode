class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean x = false;
        boolean y = false;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                x=true;
                break;
            }
        }
        
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1]){
                y=true;
                break;
            }
        }
        if(y && x){
            return false;
        }
        return true;


        
}
}
