class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans= new ArrayList<>();
         ans.add(new ArrayList<>(Arrays.asList(1)));
        if(numRows==1){
            return ans;
        }    
        // }else if(numRows>=2){
        //     ans.add(new ArrayList<>(Arrays.asList(1,1)));
        //     if(numRows==2){
        //         return ans;
        //     }
        // }
        while(numRows>1){
            List<Integer> list= ans.get(ans.size()-1);
            List<Integer> list1= new ArrayList<>();
            list1.add(list.get(0));
            for(int i=1;i<list.size();i++){
                list1.add(list.get(i-1)+list.get(i));
            }
            list1.add(list.get(list.size()-1));
            ans.add(list1);
            numRows--;
        }
        return ans;
    }
}
