class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
               if(nums[i]==1){
                count=count+1;
               }else{
                list.add(count);
                count=0;
               }
        }
        list.add(count);
        return Collections.max(list);
    }
}
