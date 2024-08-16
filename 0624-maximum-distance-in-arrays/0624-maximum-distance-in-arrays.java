class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int n = arrays.size();
        Integer smallest = arrays.get(0).get(0);
        Integer biggest = arrays.get(0).get(arrays.get(0).size() - 1);
        Integer maxDistance = 0;
        for (int i = 1; i < n; i++) {
            int m = arrays.get(i).size();
            maxDistance = Math.max(maxDistance, Math.abs(biggest - arrays.get(i).get(0)));
            maxDistance = Math.max(maxDistance, Math.abs(smallest - arrays.get(i).get(m - 1)));
            smallest = Math.min(smallest, arrays.get(i).get(0));
            biggest = Math.max(biggest, arrays.get(i).get(m - 1));
        }
        return maxDistance;
    }
}