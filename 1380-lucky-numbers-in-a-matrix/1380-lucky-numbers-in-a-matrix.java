class Solution {
    public List<Integer> luckyNumbers (int[][] matrix) {
        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < matrix.length; i++) {
            int col = findMin(matrix, i);
            int val = matrix[i][col];
            if (findMax(matrix, val, col)) {
                ans.add(val);
            }
        }
        return ans;
    }
    private int findMin(int[][] matrix, int i) {
        int minVal = matrix[i][0], col = 0;
        for (int j = 1; j < matrix[0].length; j++) {
            if (minVal > matrix[i][j]) {
                minVal = matrix[i][j];
                col = j;
            }
        }
        return col;
    }
    private boolean findMax(int[][] matrix, int val, int col) {
        for (int i = 0; i < matrix.length; i++) {
            if (val < matrix[i][col]) return false;
        }
        return true;
    }
}