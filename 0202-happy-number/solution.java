class Solution {
    public boolean isHappy(int n) {
       int a=0;
       HashSet <Integer> seen= new HashSet<>();
       while(!seen.contains(n) && n!=1) {
        seen.add(n);
        int sum=0;
        while(n>0){
            a=n%10;
            sum=sum+a*a;
            n=n/10;
        }
        n=sum;
       }
       return n==1;
    }
}
