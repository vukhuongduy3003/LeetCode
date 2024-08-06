class Solution {
    public int minimumPushes(String word) {
        int[] arr = new int[26];
        for (char c : word.toCharArray()) {
            arr[c - 'a']++;
        }
        Integer[] freqArr = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        Arrays.sort(freqArr, Collections.reverseOrder());
        int res = 0;
        int distinct = 0;
        for (Integer n : freqArr) {
            res += n * (1 + distinct / 8);
            distinct += 1;
        }
        return res;
    }
}