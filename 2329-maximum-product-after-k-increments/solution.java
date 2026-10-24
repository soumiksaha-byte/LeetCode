class Solution {
    public int maximumProduct(int[] nums, int k) {
      long mod= 1_000_000_007L;
      PriorityQueue<Integer> pq= new PriorityQueue<>();
      for(int i:nums){
        pq.offer(i);
      }
      while(k>0){
        pq.offer(pq.poll()+1);
        k--;
      }
      long value=1L;
      for(Integer a:pq){
        value=(value*a)%mod;
      }
      return (int) value; 
    }
}
