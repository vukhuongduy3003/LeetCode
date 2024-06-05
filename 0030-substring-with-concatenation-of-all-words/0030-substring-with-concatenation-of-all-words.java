class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
        List<Integer> ans = new ArrayList<>();
        Map<String, Integer> map = new HashMap<>();
        int n = words[0].length();
        for (String w : words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        for (int i = 0; i <= s.length() - n * words.length; i++) {
            Map<String, Integer> cur_map = new HashMap<>(map);
            for (int j = 0; j < words.length; j++) {
                String subStr = s.substring(i + j * n, i + (j + 1) * n);
                if (!cur_map.containsKey(subStr)) {
                    break;
                } else {
                    
                    Integer count = cur_map.get(subStr);
                    if (count == 1) {
                        cur_map.remove(subStr);
                    } else {
                        cur_map.put(subStr, count - 1);
                    }
                    if (cur_map.isEmpty()) {
                        ans.add(i);
                    }
                }
            }
        }
        return ans;
    }
}