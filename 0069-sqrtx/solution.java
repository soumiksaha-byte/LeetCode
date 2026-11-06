class Solution {
    public int mySqrt(int x) {
        int i=0;
        int j=x;
        int val=-1;
        while(i<=j){
            int mid=(i+j)/2;
            if(mid == 0 || mid <= x / mid) {
                val = mid;
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return val;
    }
}
