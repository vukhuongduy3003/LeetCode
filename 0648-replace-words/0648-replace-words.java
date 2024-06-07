class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder sb = new StringBuilder();

        String[] words = sentence.split(" ");
        HashSet<String> set = new HashSet<>(dictionary);

        for(String word : words) {
            boolean foundRoot = false;
            for(int i = 0; i < word.length(); i++) {
                String semiRoot = word.substring(0, i + 1);
                if(set.contains(semiRoot)) {
                    sb.append(semiRoot).append(" ");
                    foundRoot = true;
                    break;
                }
            }
            if(!foundRoot) 
                sb.append(word).append(" ");
        }
        sb.deleteCharAt(sb.length() - 1);

        return sb.toString();
    }
}