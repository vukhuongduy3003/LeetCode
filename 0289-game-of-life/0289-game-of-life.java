class Solution {
    public int countNeighbor(int[][] board, int r, int c) {
        int nei = 0;
        for (int i = r - 1; i <= r + 1; i++) {
            for (int j = c - 1; j <= c + 1; j++) {
                if (i < 0 || j < 0 || i >= board.length || j >= board[0].length || (i == r && j == c)) {
                    continue;
                } else {
                    if (board[i][j] == 1 || board[i][j] == 3) {
                        nei++;
                    }
                }
            }
        }
        return nei;
    }
    
    public void gameOfLife(int[][] board) {
        // Bất kỳ ô sống nào có ít hơn hai ô lân cận còn sống sẽ chết như thể do dân số thấp.
        // Bất kỳ ô sống nào có hai hoặc ba hàng xóm sống sẽ tiếp tục sống cho thế hệ tiếp theo.
        // Bất kỳ ô sống nào có nhiều hơn ba ô lân cận đều chết, như thể do dân số quá đông.
        // Bất kỳ ô chết nào có chính xác ba ô lân cận còn sống sẽ trở thành ô sống, như thể được sinh sản.
        
        // Original | New | State
        //      0   |  0  |   0
        //      1   |  0  |   1
        //      0   |  1  |   2
        //      1   |  1  |   3
        
        int m = board.length, n = board[0].length;
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int nei = countNeighbor(board, r, c);
                if (board[r][c] == 1) {
                    if (nei == 2 || nei == 3) {
                        board[r][c] = 3;
                    }
                } else if (nei == 3) {
                    board[r][c] = 2;
                }
            }
        }
        
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                if (board[r][c] == 1) {
                    board[r][c] = 0;
                } else if (board[r][c] == 2 || board[r][c] == 3) {
                    board[r][c] = 1;
                }
            }
        }
    }
}
