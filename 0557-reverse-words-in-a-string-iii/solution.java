class Solution {
    public String reverseWords(String s) {
        String [] words=s.split(" ");
        String str="";
        for(int i=0;i<words.length;i++){
            StringBuilder sb=new StringBuilder(words[i]);
            sb.reverse();
            words[i]=sb.toString();
            if(i==0){
                str=words[i];
            }
            else{
                str=str+" "+words[i];}
        }
        return str;
    }
}
