class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int i=0;
        int j=0;
        for(int n:weights){
            i=Math.max(i,n);
            j+=n;
        }
        if(days==1){
            return j;
        }
        int ans=0;
        while(i<j){
            int mid=i+(j-i)/2;
            if(capacity(mid,days,weights)){
                ans=mid;
                j=mid;
            }else{
                i=mid+1;
            }
        }
        return ans;
        
    }
    public static boolean capacity(int capacity,int days,int[] weights){
        int i=0;
        int cap=0;
        int dayCount=1;
        for(int num:weights){
            if(cap+num>capacity){
                cap=num;
                dayCount++;
            }else{
                cap+=num;
            }
            if(days<dayCount){
                return false;
            }
        }
        return true;
    }
}
