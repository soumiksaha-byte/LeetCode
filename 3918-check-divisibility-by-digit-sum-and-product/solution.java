class Solution {
    public boolean checkDivisibility(int n) {
        int m=n;
        int sum=0;
        int product=1;
        while(m>0){
            sum=sum+m%10;
            product=product*(m%10);
            m=m/10;
        }
        if(n%(sum+product)==0){
            return true;
        }else{
            return false;
        }
    }
}
