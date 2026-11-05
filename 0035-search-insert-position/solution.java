class Solution {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        int j=nums.length-1;
        int min=nums.length;
        while(i<=j){
            int mid=(i+j)/2;
            if(nums[mid]>=target){
                j=mid-1;
                min=Math.min(min,mid);
            }else if(nums[mid]<target){
                i=mid+1;
            }
        }
        return min;
    }
}
