class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> res=new ArrayList<>();
        List<Integer> prev=new ArrayList<>();
        prev.add(1);
        prev.add(1);
        if (rowIndex==0){
            return Arrays.asList(1);
        }
        else if(rowIndex==1){
            return Arrays.asList(1,1);
        }
        for(int i=0;i<= rowIndex;i++){
            res.add(1);
            for(int j=1;j<i;j++){
                res.add(prev.get(j-1)+prev.get(j));
            }
            res.add(1);
            prev=new ArrayList<>();
            prev.addAll(res);
            res=new ArrayList<>();
        }
        return prev;

    }
}
