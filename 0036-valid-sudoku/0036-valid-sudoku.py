class Solution:
    def isValidSudoku(self, board: List[List[str]]) -> bool:
        hashSet = set()
        for i in range(9):
            for j in range(9):
                if board[i][j] != ".":
                    isRow = f"{board[i][j]} is row {i}"
                    isColumn = f"{board[i][j]} is column {j}"
                    isBlock = f"{board[i][j]} is block {i // 3}-{j // 3}"
                    if isRow in hashSet or isColumn in hashSet or isBlock in hashSet:
                        return False
                    else:
                        hashSet.add(isRow)
                        hashSet.add(isColumn)
                        hashSet.add(isBlock)
        return True