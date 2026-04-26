class Solution {
    public int reverse(int x) {
        String s= String.valueOf(Math.abs(x));
        StringBuffer sf= new StringBuffer(s);
        sf=sf.reverse();
        int y= 0;
        try{
            y=Integer.parseInt(sf.toString());
        }catch(NumberFormatException e){
            return 0;
        }
        if(x<0){
            return -y;
        }
        else{
        return y;
        }
    }
}
