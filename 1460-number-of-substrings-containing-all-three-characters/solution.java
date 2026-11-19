class Solution {
    public int numberOfSubstrings(String s) {
        int i=0;
        int j=0;
        int count=0;
        int []arr=new int[3];
        while(j<s.length()){
            if(s.charAt(j)=='a'){
                arr[0]++;
            }else if(s.charAt(j)=='b'){
                arr[1]++;
            }else{
                arr[2]++;
            }
            while(arr[0]>0 && arr[1]>0 && arr[2]>0){
                if(s.charAt(i)=='a'){
                    arr[0]--;
                }else if(s.charAt(i)=='b'){
                    arr[1]--;
                }else{
                    arr[2]--;
                }
                i++;
            }
            count+=i;
            j++;
        }
        return count;
    }
}
