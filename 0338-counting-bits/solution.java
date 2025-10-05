class Solution {
    public int[] countBits(int n) {
        ArrayList<Integer>l=new ArrayList<>();
        for(int i=0;i<=n;i++){
            int j=0;
            int k=0;
            StringBuilder sb=new StringBuilder(Integer.toBinaryString(i));
            while(k<sb.length()){
                if(sb.charAt(k)=='1'){
                    j++;
                }
                k++;
            }
            l.add(j);
        }
        int [] res=new int[l.size()];
        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }
        return res;
    }
}
