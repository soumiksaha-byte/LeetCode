class Solution {
    public boolean checkRecord(String s) {
        int a_count=0;
        int l_count=0;
       for(int i=0;i<s.length();i++){
          if(s.charAt(i)=='A'){
            a_count++;
          }
          if(a_count>=2){
            return false;
          }
       }
       for(int i=0;i<s.length()-2;i++){
        if(s.charAt(i)=='L' && s.charAt(i+1)=='L' && s.charAt(i+2)=='L'){
           return false;
        }
       }
       return true;
    }
}
