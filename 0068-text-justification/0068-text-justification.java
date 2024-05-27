class Solution {
    public List<String> fullJustify(String[] words, int maxWidth) {
        int n = words.length;
        List<String> ans = new ArrayList<>();
        
        int len = 0;
        List<String> line = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (len + line.size() + words[i].length() > maxWidth) {
                int extra_spaces = maxWidth - len;
                int spaces = extra_spaces / Math.max(1, line.size() - 1);
                int remainder = extra_spaces % Math.max(1, line.size() - 1);
                for (int j = 0; j < Math.max(1, line.size() - 1); j++) {
                    line.set(j, line.get(j) + " ".repeat(spaces));
                    if (remainder != 0) {
                        line.set(j, line.get(j) + " ");
                        remainder--;
                    }
                }
                ans.add(String.join("", line));
                len = 0;
                line.clear();
            }
            
            line.add(words[i]);
            len += words[i].length();
        }
        String last_line = String.join(" ", line);
        ans.add(last_line + " ".repeat(maxWidth - last_line.length()));
        return ans;
    }
}