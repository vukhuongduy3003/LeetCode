class Solution {
    public String minWindow(String s, String t) {
        if (t.isEmpty()) {
            return "";
        }

        Map<Character, Integer> map = new HashMap<>(), window = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int need = map.size(), have = 0;
        int[] ans = new int[]{-1, -1};
        int lenAns = Integer.MAX_VALUE;
        int l = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            window.put(c, window.getOrDefault(c, 0) + 1);

            if (map.containsKey(c) && window.get(c).equals(map.get(c))) {
                have++;
            }

            while (have == need) {
                if ((r - l + 1) < lenAns) {
                    ans = new int[]{l, r + 1};
                    lenAns = r - l + 1;
                }

                char leftChar = s.charAt(l);
                window.put(leftChar, window.get(leftChar) - 1);

                if (map.containsKey(leftChar) && window.get(leftChar) < map.get(leftChar)) {
                    have--;
                }
                l++;
            }
        }

        return lenAns != Integer.MAX_VALUE ? s.substring(ans[0], ans[1]) : "";
    }
}