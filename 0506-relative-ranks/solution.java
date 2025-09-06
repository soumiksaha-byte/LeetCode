class Solution {
    public String[] findRelativeRanks(int[] score) {
    int n = score.length;
    String[] res = new String[n];

    // Step 1: Copy and sort scores descending
    int[] sorted = score.clone();
    Arrays.sort(sorted);
    // reverse for descending
    for (int i = 0; i < n / 2; i++) {
        int temp = sorted[i];
        sorted[i] = sorted[n - 1 - i];
        sorted[n - 1 - i] = temp;
    }

    // Step 2: Map score → rank
    Map<Integer, Integer> scoreToRank = new HashMap<>();
    for (int i = 0; i < n; i++) {
        scoreToRank.put(sorted[i], i);
    }

    // Step 3: Assign medals / ranks
    for (int i = 0; i < n; i++) {
        int rank = scoreToRank.get(score[i]);
        if (rank == 0) res[i] = "Gold Medal";
        else if (rank == 1) res[i] = "Silver Medal";
        else if (rank == 2) res[i] = "Bronze Medal";
        else res[i] = Integer.toString(rank + 1);
    }

    return res;
}

}
