class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        while (i < nums1.length && j < nums2.length){
            if (nums1[i] < nums2[j]){
                i++;
            }
            else if (nums1[i] > nums2[j]){
                j++;
            }
            else {
                arr.add(nums1[i]);
                i++;
                j++;
            }
        }
        int n = arr.size();
        int[] ans = new int[n];
        for (int k = 0; k < n; k++){
            ans[k] = arr.get(k);
        }
        return ans;
    }
}