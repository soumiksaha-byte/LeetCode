class Solution {
    public int longestPalindrome(String s) {
        Map<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            map.put(s.charAt(i),map.getOrDefault(s.charAt(i), 0) + 1);
        }
       char[] keyArray = new char[map.size()];
       int i = 0;
       for (Character c : map.keySet()) {
          keyArray[i] = c;
          i++;
        }
        int count=0;
        for(int j=0;j<keyArray.length;j++){
            if(map.get(keyArray[j])>=2){
                count=map.get(keyArray[j])/2+count;
            }
        }
        int res=count*2;
        if(res==s.length()){
            return res;
        }
        else{
            return res+1;
        }

    }
}
