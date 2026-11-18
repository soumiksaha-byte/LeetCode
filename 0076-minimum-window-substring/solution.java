class Solution {
    public String minWindow(String s, String t) {
        int i=0;
        int j=0;
        int start=0;
        int formed=0;
        int min=Integer.MAX_VALUE;
        if(s.length()<t.length()){
            return "";
        }
        HashMap<Character,Integer>mapT=new HashMap<>();
        HashMap<Character,Integer>mapS=new HashMap<>();
        for(char c:t.toCharArray()){
            mapT.put(c,mapT.getOrDefault(c,0)+1);
        }
        while(j<s.length()){
            mapS.put(s.charAt(j),mapS.getOrDefault(s.charAt(j),0)+1);
            if(mapT.containsKey(s.charAt(j)) && mapT.get(s.charAt(j)).equals(mapS.get(s.charAt(j)))){
                formed++;
            }
            while(formed==mapT.size()){
                if(j-i+1 < min) {
                    min = j-i+1;
                    start = i;
                }
                mapS.put(s.charAt(i),mapS.get(s.charAt(i))-1);
                if(mapT.containsKey(s.charAt(i)) && mapT.get(s.charAt(i))>mapS.get(s.charAt(i))){
                    formed--;
                }
                i++;
            }
            j++;
        }
        if(min==Integer.MAX_VALUE){
            return "";
        }else{
            return s.substring(start,min+start);
        }
    }
}
 
