class Solution {
    public int[] merge(int[] a1, int[] a2) {
        int n = a1.length + a2.length;
        int[] result = new int[n];
        int i = 0, i1 = 0, i2 = 0;
        while (i < n) {
            if (i1 < a1.length && i2 < a2.length) {
                if (a1[i1] <= a2[i2]) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                } else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            } else {
                if (i1 < a1.length) {
                    result[i] = a1[i1];
                    i++;
                    i1++;
                }
                else {
                    result[i] = a2[i2];
                    i++;
                    i2++;
                }
            }
        }
        
        return result;
    }
    
    public int[] mergeSort(int[] nums, int L, int R) {
        if (L > R) {
            return new int[0];
        }
        if (L == R) {
            int[] arr = {nums[L]};
            return arr;
        }
        
        int k = (L + R) / 2;
        int[] a1 = mergeSort(nums, L, k);
        int[] a2 = mergeSort(nums, k + 1, R);
        
        return merge(a1, a2);
    }
    
    public int[] sortArray(int[] nums) {
        return mergeSort(nums, 0, nums.length - 1);
    }
}