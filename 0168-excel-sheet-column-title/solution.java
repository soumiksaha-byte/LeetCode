class Solution {
    public String convertToTitle(int columnNumber) {
       String arr[]={"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
       StringBuilder st = new StringBuilder();
       int res;
       while(columnNumber>0){
        columnNumber--;              // ✅ only once
        res = columnNumber % 26; // remainder
        st.append(arr[res]);
        columnNumber = columnNumber / 26;
      }
      String str = st.reverse().toString();
      return str;
    }
}
