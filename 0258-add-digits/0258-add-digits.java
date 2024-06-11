class Solution {
    public int addDigits(int num) {
        while (!(0 <= num && num <= 9)) {
            int temp = num % 10;
            num /= 10;
            num += temp;
        }
        return num;
    }
}