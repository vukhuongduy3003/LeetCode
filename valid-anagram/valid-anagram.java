class Solution {
    public boolean isAnagram(String s, String t) {
        // my way
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++){
            Character s1 = s.charAt(i);
            Character t1 = t.charAt(i);
            map.put(s1, map.getOrDefault(s1, 0) + 1);
            map.put(t1, map.getOrDefault(t1, 0) - 1);
        }
        for (Integer i : map.values()){
            if (i != 0) return false;
        }
        return true;
        // Different way
        // if (s.length() != t.length()) return false;
        // int[] arr = new int[26];
        // for (int i = 0; i < s.length(); i++){
        //     arr[s.charAt(i) - 'a']++;
        //     arr[t.charAt(i) - 'a']--;
        // }
        // for (int i = 0; i < 26; i++){
        //     if (arr[i] != 0) return false;
        // }
        // return true;
    }
}