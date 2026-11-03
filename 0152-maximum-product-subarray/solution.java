class Solution {
    public int maxProduct(int[] nums) {
        int maxPro=nums[0];
        int minPro=nums[0];
        int currPro=nums[0];
        for(int i=1;i<nums.length;i++){
            int num=nums[i];
            int tempMax=Math.max(num,Math.max(maxPro*num,minPro*num));
            int tempMin=Math.min(num,Math.min(maxPro*num,minPro*num));
            maxPro=tempMax;
            minPro=tempMin;
            currPro=Math.max(currPro,maxPro);
        }
        return currPro;
    }
}
