class Solution {
    public boolean detectCapitalUse(String word) {
        String a="";
        for(int i=0;i<word.length();i++){
            if(Character.isUpperCase(word.charAt(i))){
                a=a+word.charAt(i);
            }
        }
        if(a.length()==1){
            if(a.charAt(0)==word.charAt(0)){
                return true;
            }
        }
        if(a.length()==word.length() || a.length()==0){
            return true;
        }
        else{
            return false;
        }
    }
}
