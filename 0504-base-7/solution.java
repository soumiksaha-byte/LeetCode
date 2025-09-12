class Solution {
    public String convertToBase7(int num) {
        int rem=0;
        int que=0;
        int nums=Math.abs(num);
        String str="";
        if(num==0){
            return "0";
        }
        while(nums!=0){
            rem=nums%7;
            str=Integer.toString(rem)+str;
            nums=nums/7;
        }
        if(num<0){
            return "-"+str;
        }
        return str;
    }
}
