class Solution {
    public int distributeCandies(int[] candyType) {
        Set<Integer>set= new HashSet<>();
        int max=(candyType.length/2);
        for(int i:candyType){
            set.add(i);
        }
        int unq=set.size();
        if(unq>max){
            return max;
        }
        else{
            return unq;
        }
    }
}
