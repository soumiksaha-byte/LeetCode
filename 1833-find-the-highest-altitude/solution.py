class Solution(object):
    def largestAltitude(self, gain):
        """
        :type gain: List[int]
        :rtype: int
        """
        s = [0]
        for i in range(len(gain)):
            x = s[-1] + gain[i]  # Calculate altitude gain at each step
            s.append(x)
        return max(s)

# Example usage:
solution = Solution()
gain = [-5, 1, 5, 0, -7]
print(solution.largestAltitude(gain))  # Output should be 1

