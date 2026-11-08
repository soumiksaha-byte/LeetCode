class Solution {
    public int findKthPositive(int[] arr, int k) {
        ArrayList<Integer> list= new ArrayList<>();
        int j=0;
        for(int i=1;i<arr[arr.length-1];i++){
            if(arr[j]>i){
                list.add(i);
            }else if(arr[j]==i){
                j++;
            }
        }
        if(k>list.size()){
            return arr.length+k;
        }
        return list.get(k-1);
    }
}
