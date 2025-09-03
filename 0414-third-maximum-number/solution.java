class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        List<Integer> l1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           if(nums[i]<nums[nums.length-1]){
            l1.add(nums[i]);
           }
        }
        List<Integer> l2=new ArrayList<>();
        for(int i=0;i<l1.size();i++){
           if(l1.get(i)<l1.get(l1.size()-1)){
            l2.add(l1.get(i));
           }
        }
        if(l2.size()==0){
            return nums[nums.length-1];
        }
        else{
            return l2.get(l2.size()-1);
        }
    }
}
