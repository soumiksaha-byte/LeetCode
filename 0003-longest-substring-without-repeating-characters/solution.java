class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();
        int a=0;
        int b=0;
        int maxLength=0;
            while(b<s.length()){
                if(set.contains(s.charAt(b))){
                    set.remove(s.charAt(a));
                    a++;
                }
                else{
                    set.add(s.charAt(b));
                    maxLength=Math.max(maxLength,b-a+1);
                    b++;
                }
        }
    return maxLength;
    }
}
