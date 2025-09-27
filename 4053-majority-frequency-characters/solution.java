class Solution {
    public String majorityFrequencyGroup(String s){
        // Step 1: Count frequency of each character
        Map<Character, Integer> freqMap = new HashMap<>();
        for (char ch : s.toCharArray()) {
            freqMap.put(ch, freqMap.getOrDefault(ch, 0) + 1);
        }

        // Step 2: Group characters by frequency
        Map<Integer, List<Character>> groupMap = new HashMap<>();
        for (Map.Entry<Character, Integer> entry : freqMap.entrySet()) {
            int freq = entry.getValue();
            groupMap.putIfAbsent(freq, new ArrayList<>());
            groupMap.get(freq).add(entry.getKey());
        }

        // Step 3: Find majority frequency group
        int maxGroupSize = 0;
        int chosenFreq = -1;

        for (int freq : groupMap.keySet()) {
            int groupSize = groupMap.get(freq).size();

            if (groupSize > maxGroupSize || (groupSize == maxGroupSize && freq > chosenFreq)) {
                maxGroupSize = groupSize;
                chosenFreq = freq;
            }
        }

        // Step 4: Build result string
        StringBuilder result = new StringBuilder();
        for (char ch : groupMap.get(chosenFreq)) {
            result.append(ch);
        }

        return result.toString();
    }

    }
