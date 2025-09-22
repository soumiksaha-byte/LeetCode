 class Solution {
    public static int maxFrequencyElements(int[] nums) {
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        for (int count : freqMap.values()) {
            maxFreq = Math.max(maxFreq, count);
        }

        int result = 0;
        for (int count : freqMap.values()) {
            if (count == maxFreq) {
                result += count;
            }
        }

        return result;
    }

}
