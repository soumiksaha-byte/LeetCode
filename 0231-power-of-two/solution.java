class Solution {
    public boolean isPowerOfTwo(int n) {
        if(n==1){
            return true;
        }
        else if(n==0){
            return false;
        }
        else{
            if(n%2==0){
                n=n/2;
            }else{
                return false;
            }
            }
                return isPowerOfTwo(n);
    }
}
