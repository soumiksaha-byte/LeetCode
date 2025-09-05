class Solution {
    public String[] findWords(String[] words) {
        List<String>list=new ArrayList<>();
        String a="qwertyuiop";
        String b="asdfghjkl";
        String c="zxcvbnm";
        for(String word:words){
            int [] arr= new int[3];
            for(char ch:word.toLowerCase().toCharArray()){
                   if(a.indexOf(ch)!=-1){
                    arr[0]=1;
                   }
                   else if(b.indexOf(ch)!=-1){
                    arr[1]=1;
                   }
                   else if(c.indexOf(ch)!=-1){
                    arr[2]=1;
                   }
            }
            int sum=arr[0]+arr[1]+arr[2];
            if(sum==1){
            list.add(word);
        }}
        String [] s=new String[list.size()];
        int i=0;
        for(String str:list){
            s[i++]=str;
        }

        return s;
    }
}
