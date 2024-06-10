class Solution {
    public void rotate(int[][] matrix) {
        int left = 0, right = matrix[0].length - 1;
        while (left < right) {
            for (int i = 0; i < right - left; i++) {
                int top = left, bottom = right;
                int temp = matrix[top][left + i];
                matrix[top][left + i] = matrix[bottom - i][left];
                matrix[bottom - i][left] = matrix[bottom][right - i];
                matrix[bottom][right - i] = matrix[top + i][right];
                matrix[top + i][right] = temp;
            }
            left++;
            right--;
        }
    }
}