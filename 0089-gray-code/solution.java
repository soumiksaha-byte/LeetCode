class Solution {
    public List<Integer> grayCode(int n) {
        int x=(int) Math.pow(2,n);
        int gray=0;
        List<Integer>list=new ArrayList<>();
        for(int i=0;i<x;i++){
            gray=i^(i>>1);
            list.add(gray);
        }
       return list;
    }
}
