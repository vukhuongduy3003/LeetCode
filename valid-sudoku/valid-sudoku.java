class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> set = new HashSet<>();
        int size = board.length;
        for (int i = 0; i < size; i++)
            for (int j = 0; j < size; j++){
                Character c = board[i][j];
                if (c != '.')
                    if (!set.add(c + " at row " + i) ||
                        !set.add(c + " at col " + j) ||
                        !set.add(c + " at grid " + i / 3 + j / 3)){
                            return false;
                    }
            }
        return true;
    }
}