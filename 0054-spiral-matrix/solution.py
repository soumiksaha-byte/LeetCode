class Solution:
    def spiralOrder(self, matrix: List[List[int]]) -> List[int]:
        n=len(matrix[0])
        m=len(matrix)
        ans=[]
        dir = [(0,1), (1,0), (0,-1), (-1,0)]
        curr_dir = 0
        curr_r, curr_c = 0, 0

        while len(ans) < m * n:
            ans.append(matrix[curr_r][curr_c])
            matrix[curr_r][curr_c] = 1000  # Mark as visited
            
            next_r = curr_r + dir[curr_dir][0]
            next_c = curr_c + dir[curr_dir][1]

            if (next_r < 0 or next_r >= m or
                next_c < 0 or next_c >= n or
                matrix[next_r][next_c] == 1000):
                curr_dir = (curr_dir + 1) % 4  # Change direction

            curr_r += dir[curr_dir][0]
            curr_c += dir[curr_dir][1]

        return ans
        
