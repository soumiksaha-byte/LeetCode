class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb= new StringBuilder();
        int min=200;
        int j=0;
        for(String i:strs){
            if(i.length()<min){
                min=i.length();
            }
        }
        while(j<min){
            char temp=strs[0].charAt(j);
            for(int i=0;i<strs.length;i++){
                if(temp!=strs[i].charAt(j)){
                    return sb.toString();
                }
        }
        sb.append(temp);
        j++;
        }
        return sb.toString();
    }
    }

