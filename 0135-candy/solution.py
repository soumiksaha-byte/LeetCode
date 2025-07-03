class Solution(object):
   def candy(self, ratings):
    n = len(ratings)
    candies = [1] * n  # Step 1: Everyone gets 1 candy

    # Step 2: Left to right — if higher than left, give more candies
    for i in range(1, n):
        if ratings[i] > ratings[i - 1]:
            candies[i] = candies[i - 1] + 1

    # Step 3: Right to left — if higher than right, fix accordingly
    for i in range(n - 2, -1, -1):
        if ratings[i] > ratings[i + 1]:
            candies[i] = max(candies[i], candies[i + 1] + 1)

    return sum(candies)


        
        
