class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        for(int i=0;i<ransomNote.length();i++){
            for(int j=0;j<magazine.length();j++){
                if(ransomNote.charAt(i)==magazine.charAt(j)){
                       magazine = magazine.replaceFirst(Character.toString(magazine.charAt(j)), "1");
                       break;
                }
            }
        }
        int count=0;
        for(int i=0;i<magazine.length();i++){
            if(magazine.charAt(i)=='1'){
               count=count+1;
            }
        }
            if(count==ransomNote.length()){
                return true;
            }
        return false;
    }
}
