class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int n = arr1.length, m = arr2.length;
        int[] ans = new int[n];
        Map<Integer, Integer> treeMap = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            treeMap.put(arr1[i], treeMap.getOrDefault(arr1[i], 0) + 1);
        }
        int index = 0;
        for (int i = 0; i < m; i++) {
            if (treeMap.containsKey(arr2[i])) {
                int cnt = treeMap.get(arr2[i]);
                while (cnt > 0) {
                    ans[index] = arr2[i];
                    cnt--;
                    index++;
                }
                if (cnt == 0) {
                    treeMap.remove(arr2[i]);
                }
            }
        }
        for (Map.Entry<Integer, Integer> e : treeMap.entrySet()) {
            int val = e.getValue();
            while (val > 0) {
                ans[index] = e.getKey();
                val--;
                index++;
            }
        }
        return ans;
    }
}