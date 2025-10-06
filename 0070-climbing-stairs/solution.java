class Solution {
    public int count=0;
    public int climbStairs(int n) {
        if (n <= 2) return n;
        
        int first = 1;  // ways(1)
        int second = 2; // ways(2)
        int third = 0;
        
        for (int i = 3; i <= n; i++) {
            third = first + second;
            first = second;
            second = third;
        }
        
        return second;
}}
