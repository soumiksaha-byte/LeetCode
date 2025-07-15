class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        for i in range (9):
            seen=set()
            for j in range (9):
                if board[i][j] in seen and board[i][j]!=".":
                    return False
                seen.add(board[i][j])
        for i in range (9):
            seen=set()
            for j in range (9):
                if board[j][i] in seen and board[j][i]!="." :
                    return False
                seen.add(board[j][i])
        i=0
        j=0
        seen=set()
        x=0
        y=0
        i = 0
        while i < 9:
            j = 0
            while j < 9:
                seen = set()
                for dx in range(3): 
                    for dy in range(3):
                        val = board[i + dx][j + dy]
                        if val != ".":
                            if val in seen:
                                return False
                            seen.add(val)
                j += 3
            i += 3
        return True


        

        
