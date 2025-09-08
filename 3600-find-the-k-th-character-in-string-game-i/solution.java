class Solution {
    StringBuilder word = new StringBuilder("a");

    public char kthCharacter(int k) {
        while (word.length() < k) {
            int size = word.length();
            for (int i = 0; i < size; i++) {
                char ch = word.charAt(i);
                char next = (ch == 'z') ? 'a' : (char)(ch + 1);
                word.append(next);
            }
        }
        return word.charAt(k - 1);
    }
}

