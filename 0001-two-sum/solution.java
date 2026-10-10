class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer>map= new HashMap<>();
        for(int j=0;j<nums.length;j++){
            int comp=target-nums[j];
            if(map.containsKey(comp) && j!=map.get(comp)){
                return new int []{j,map.get(comp)};
            }
            map.put(nums[j],j);
        }
        return new int[]{-1,1};
    }
}
