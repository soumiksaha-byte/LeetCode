class Solution {
    public boolean doesAliceWin(String s) {
        char[] charArray = s.toCharArray();
        char[] vow = {'a','e','i','o','u'};
        int count=0;
        for(int i=0;i<s.length();i++){
            for(int j=0;j<vow.length;j++){
                if(charArray[i]==vow[j]){
                    count++;
                }
            }
        }
        if(count==0){
            return false;
        }
        else{
            return true;
        }
    }
}
