class Solution {
    public boolean canAliceWin(int n) {
        if (n<10){
            return false;
        }
        int stones=0;
        boolean alice=false;
        for(int i=10;i>0;i--){
            if(i>n){
                return alice;
            }else{
                n-=i;
                alice=!alice;
            }
        }
        return alice;
    }
}