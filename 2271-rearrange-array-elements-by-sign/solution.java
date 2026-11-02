class Solution {
    public int[] rearrangeArray(int[] nums) {
        int [] res= new int[nums.length];
        int neg=1;
        int pos=0;
        for(int num: nums){
            if(num>0){
                res[pos]=num;
                pos+=2;
            }else{
                res[neg]=num;
                neg+=2;
            }
        }
        return res;
    }
}
