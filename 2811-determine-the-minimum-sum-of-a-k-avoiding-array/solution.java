class Solution {
    public int minimumSum(int n, int k) {
        int sum=0;
        HashSet<Integer> set= new HashSet<>();
        int i=1;
        int j=0;
        while(j<n){
            if(!set.contains(i)){
                sum+=i;
                j++;
                if(k>i){
                  set.add(k-i);
                }
            }
            i++;
        }
        return sum;
    }
}
