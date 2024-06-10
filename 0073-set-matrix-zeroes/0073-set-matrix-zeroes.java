class Solution {
    public void setZeroes(int[][] matrix) {
        int n = matrix.length, m = matrix[0].length;
        List<Pair<Integer, Integer>> l = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == 0) {
                    l.add(new Pair<>(i, j));
                }
            }
        }
        for (Pair<Integer, Integer> p : l) {
            int row = p.getKey(), col = p.getValue();
            for (int i = 0; i < n; i++) {
                matrix[i][col] = 0;
            }
            for (int j = 0; j < m; j++) {
                matrix[row][j] = 0;
            }
        }
    }
}