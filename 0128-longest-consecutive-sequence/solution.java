class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        HashSet<Integer> set= new HashSet<>();
        for(int num:nums){
            set.add(num);
        }
        int count=1;
        int max=1;
        int j=1;
        for(int i:set){
            if(set.contains(i-1)){
                continue;
            }else{
                j=1;
                count=1;
                while(true){
                    if(set.contains(i+j)){
                        count++;
                        j++;
                    }else{
                        break;
                    }
                }
                max=Math.max(max,count);
            }
        }
         return max;
    }
}
