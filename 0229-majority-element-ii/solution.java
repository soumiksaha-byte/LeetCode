class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> ans= new ArrayList<>();
        int cand1=0;
        int cand2=0;
        int coun1=0;
        int coun2=0;
        for(int i=0;i<nums.length;i++){
            if(coun1>0 && nums[i]==cand1){
                coun1++;
            }else if(coun2>0 && nums[i]==cand2){
                coun2++;
            }else if(coun1==0){
                cand1=nums[i];
                coun1=1;
            }else if(coun2==0){
                cand2=nums[i];
                coun2=1;
            }else{
                coun1--;
                coun2--;
            }
        }
        coun1=0;
        coun2=0;
        for(int num:nums){
            if(cand1==num){
                coun1++;
            }else if(cand2==num){
                coun2++;
            }
        }
        if(coun1>nums.length/3){
            ans.add(cand1);
        }
        if(coun2>nums.length/3 && cand1!=cand2){
            ans.add(cand2);
        }
        return ans;
    }
}
