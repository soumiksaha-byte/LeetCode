class Solution {
    public String toHex(int num) {
        if (num < 0) {
            long n = (1L << 32) + num;   // 2^32 + num
            return Long.toHexString(n);
        } else {
            return Integer.toHexString(num);
        }
    }
}

