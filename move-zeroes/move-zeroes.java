class Solution {
    public void moveZeroes(int[] nums) {
        // My Ways
        // int n = nums.length;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int count = 0;
        // for (int i = 0; i < n; i++){
        //     if (nums[i] != 0){
        //         map.put(count++, nums[i]);
        //     }
        // }
        // int[] nums1 = new int[n];
        // for (Integer i : map.keySet()){
        //     nums1[i] = map.get(i);
        // }
        // System.arraycopy(nums1, 0, nums, 0, n);
        
        // Different Way
        int snowBallSize = 0;
        for (int i = 0; i < nums.length; i++){
            if (nums[i] == 0){
                snowBallSize++;
            }
            else if (snowBallSize > 0){
                int temp = nums[i];
                nums[i] = 0;
                nums[i - snowBallSize] = temp;
            }
        }
    }
}