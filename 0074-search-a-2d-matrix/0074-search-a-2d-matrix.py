class Solution:
    def searchMatrix(self, matrix: List[List[int]], target: int) -> bool:
        row, columns, rows = 0, len(matrix[0]), len(matrix)
        column = columns - 1
        while row < rows and column > -1:
            current = matrix[row][column]
            if current == target:
                return True
            if target < current:
                column -= 1
            else:
                row += 1
        return False