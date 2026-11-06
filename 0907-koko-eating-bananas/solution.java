class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int i=1;
        int j=0;
        long count=0;
        int ans=0;
        for(int num:piles){
            j=Math.max(num,j);
        }
        while(i<=j){
            int mid=(i+j)/2;
            count=0;
            for(int p:piles){
                if(p>mid){
                    count+=(p-1)/mid+1;
                }else{
                    count++;
                }
            }
            if(count<=h){
                ans=mid;
                j=mid-1;
            }else{
                i=mid+1;
            }
        }
        return ans;
        
    }
}
