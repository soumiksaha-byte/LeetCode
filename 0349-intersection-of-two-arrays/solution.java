
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        // Store nums1 in a set
        Set<Integer> set1 = new HashSet<>();
        for (int num : nums1) {
            set1.add(num);
        }

        // Store intersection
        Set<Integer> res = new HashSet<>();
        for (int num : nums2) {
            if (set1.contains(num)) {
                res.add(num); // ensures uniqueness
            }
        }

        // Convert Set<Integer> → int[]
        return res.stream().mapToInt(Integer::intValue).toArray();
    }
}

