class Solution {
    public int firstUniqChar(String s) {
        // My way
        // int n = s.length();
        // HashMap<Character, Integer> map = new HashMap<>();
        // for (int i = 0; i < n; i++){
        //     map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        // }
        // for(int i = 0; i < n; i++){
        //     if (map.get(s.charAt(i)) == 1) {
        //         return i;
        //     }
        // }
        // return -1;
        
        // Different way
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if(s.indexOf(c) == s.lastIndexOf(c)) {
                return i;
            }
        }
        return -1;
    }
}