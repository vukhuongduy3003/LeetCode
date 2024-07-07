class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles;
        while (numBottles >= numExchange) {
            int temp = numBottles / numExchange;
            numBottles = numBottles % numExchange + temp;
            ans += temp;
        }
        return ans;
    }
}