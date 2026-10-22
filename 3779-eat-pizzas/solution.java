class Solution {
    public long maxWeight(int[] pizzas) {
        Arrays.sort(pizzas);
        int idx=pizzas.length-1;
        int day_count=pizzas.length/4;
        long maxWeight=0;
        int odd=(day_count+1)/2;
        int even=day_count/2;
        while(odd>0){
            maxWeight+=pizzas[idx];
            idx--;
            odd--;
        }
        while(even>0){
            idx--;
            maxWeight+=pizzas[idx];
            even--;
            idx--;
        }
        return maxWeight;

    }
}
