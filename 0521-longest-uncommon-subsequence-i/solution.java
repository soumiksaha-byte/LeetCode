class Solution {
    public int findLUSlength(String a, String b) {
        if(a.equals(b)){
            return -1;
        }
        int len;
        if(a.length()>b.length()){
            len=a.length();
        }
        else{
            len=b.length();
        }
        return len;
    }
}
