
class Solution {
    public int minDays(int[] bloomDay, int m, int k) {
        if ((long)m * k > bloomDay.length) {
            return -1;
        }

        int i = Integer.MAX_VALUE;
        int j = 0;

        for (int n : bloomDay) {
            j = Math.max(j, n);
            i = Math.min(i, n);
        }

        int ans = -1;

        while (i <= j) {
            int mid = i + (j - i) / 2;
            int count = 0;
            int bouquet = 0;

            for (int p = 0; p < bloomDay.length; p++) {
                if (bloomDay[p] <= mid) {
                    count++;

                    if (count == k) {
                        bouquet++;
                        count = 0;
                    }
                } else {
                    count = 0;
                }
            }

            if (bouquet >= m) {
                ans = mid;
                j = mid - 1;
            } else {
                i = mid + 1;
            }
        }

        return ans;
    }
}

