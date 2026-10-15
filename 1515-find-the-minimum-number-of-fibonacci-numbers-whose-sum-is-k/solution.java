class Solution {
    public int findMinFibonacciNumbers(int k) {
        ArrayList<Integer>fib=new ArrayList<>();
        fib.add(1);
        fib.add(2);
        while(true){
            int val=fib.get(fib.size()-1)+fib.get(fib.size()-2);
            if(val<=k){
                fib.add(val);
            }else if(val==k){
                return 1;
            }else{
                break;
            }
        }
        int i=1;
        int count=0;
        while(k>0){
          if(k>=fib.get(fib.size()-i)){
            k=k-fib.get(fib.size()-i);
            count++;
          }else{
            i++;
          }
        }
        return count;
    }
}
