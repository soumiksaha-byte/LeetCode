class Solution {
    public String reverseStr(String s, int k) {
        int border=2*k;
        StringBuilder sb = new StringBuilder(s);
        // if(s.length()<k){
        //    sb.reverse();
        //    String str = sb.toString();
        //    return str;
        // }
        for(int i=0;i<s.length()-1;i=i+border){
        int first=i;
        int last=i+k-1;
        if(last>=s.length()){
            last=s.length()-1;
        }
            while(first<last){
            char temp = sb.charAt(first);
            sb.setCharAt(first, sb.charAt(last));
            sb.setCharAt(last, temp);
            first++;
            last--;
        }
        }
        String str = sb.toString();
        return str;
    }
}
