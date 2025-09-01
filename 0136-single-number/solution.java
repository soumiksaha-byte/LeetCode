class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int curr=nums[0];
        int count=1;
        for(int i=1;i<nums.length;i++){
            if(curr==nums[i]){
                count=count+1;
            }else{
                if(count<2){
                    return curr;
                }
                curr=nums[i];
                count=1;
            }

            }
            return curr;
        }
    }
