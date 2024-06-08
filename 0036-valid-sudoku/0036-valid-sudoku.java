class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    String isRow = board[i][j] + " is row " + i;
                    String isCol = board[i][j] + " is col " + j;
                    String isBlock = board[i][j] + " is block " + i / 3 + ", " + j / 3;
                    if (map.containsKey(isRow) || map.containsKey(isCol) || map.containsKey(isBlock)) {
                        return false;
                    } else {
                        map.put(isRow, 1);
                        map.put(isCol, 1);
                        map.put(isBlock, 1);
                    }
                }
            }
        }
        return true;
    }
}