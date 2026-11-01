class Solution {
    public void moveZeroes(int[] nums) {
        int k=0;
        int c=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[k]=nums[i];
                k++;
            }else{
                c++;
            }
        }
        while(c>0){
            nums[nums.length-c]=0;
            c--;
        }
    }
}
