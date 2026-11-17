class Solution {
    public boolean checkValidString(String s) {
        int c1=0;
        int c2=0;
        for(char c:s.toCharArray()){
            if(c=='('){
                c1++;
                c2++;
            }else if(c==')'){
                c2--;
                c1--;
                if(c2<0){
                    return false;
                }
                
            }else{
                c1--;
                c2++;
            }
            if(c1<0){
                    c1=0;
                }
        }
        if(c1==0){
            return true;
        }
        return false;
    }
}
