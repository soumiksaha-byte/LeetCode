class Solution {
    public String licenseKeyFormatting(String s, int k) {
        String upper = s.toUpperCase();
        
        List<Character>list=new ArrayList<>();
        String str="";
        for(int i=0;i<upper.length();i++){
            if(s.charAt(i)!='-'){
                list.add(upper.charAt(i));
            }
        }
        int q=list.size()%k;
        int f=0;
        if(q==0){
            for(int i=0;i<list.size();i++){
                if(f==k){
                    str=str+"-";
                    f=0;
                }
                    str=str+list.get(i);
                    f++;
            }
        }
        else{
            for(int i=0;i<q;i++){
                 str=str+list.get(i);
                 
            }
            if(upper.length()>1){
                str=str+"-";}
            for(int i=q;i<list.size();i++){
                if(f==k){
                    str=str+"-";
                    f=0;
                }
                    str=str+list.get(i);
                    f++;
            }
        }
        return str;
    }
}
