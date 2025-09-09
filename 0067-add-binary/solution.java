class Solution {
    public String addBinary(String a, String b) {
        if(a.length()>b.length()){
            while(b.length()<a.length()){
                b="0"+b;
            }
        }else{
            while(a.length()<b.length()){
                a="0"+a;
            }
        }
        char carry='0';
        String res="";
        for(int i=a.length()-1;i>=0;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1' && carry=='0'){
                  res='0'+res;
                  carry='1';
            }
            else if(a.charAt(i)=='1' && b.charAt(i)=='0' && carry=='0'){
                res='1'+res;
                carry='0';
            }else if(a.charAt(i)=='1' && b.charAt(i)=='0' && carry=='1'){
                res='0'+res;
                carry='1';
            }else if(a.charAt(i)=='1' && b.charAt(i)=='1' && carry=='1'){
                res='1'+res;
                carry='1';
            }else if(a.charAt(i)=='0' && b.charAt(i)=='1' && carry=='1'){
                res='0'+res;
                carry='1';
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && carry=='1'){
                res='1'+res;
                carry='0';
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0' && carry=='0'){
                res='0'+res;
                carry='0';
            }else if(a.charAt(i)=='0' && b.charAt(i)=='1' && carry=='0'){
                res='1'+res;
                carry='0';
            }
        
        }
        if(carry=='1'){
            res='1'+res;
        }
        return res;
    }
}
