class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int countOdd = 0;
        for (int a : arr) {
            if (a % 2 == 1) {
                countOdd++;
            } else {
                countOdd = 0;
            }
            if (countOdd == 3) {
                return true;
            }
        }
        return false;
    }
}