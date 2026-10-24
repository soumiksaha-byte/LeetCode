class Solution {
    public long makeIntegerBeautiful(long n, int target) {
        long m= n;
        int sum=0;
        long i=1;
        long candidate=((n+i-1)/i)*i;
        while(m>0){
                sum+=m%10;
                m=m/10;
            }
        if(sum<=target){
            return 0;
        }
        while(sum>target){
            sum=0;
            i*=10;
            candidate=((n+i-1)/i)*i;
            m=candidate;
            while(m>0){
                sum+=m%10;
                m=m/10;
            }
        }
        return candidate-n;
    }
}
