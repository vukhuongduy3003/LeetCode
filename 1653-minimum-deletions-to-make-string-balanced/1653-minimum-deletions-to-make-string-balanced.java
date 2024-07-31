class Solution {
    public int minimumDeletions(String s) {
        int bCnt = 0, delReq = 0;
        for (var chr : s.toCharArray()) {
            if (chr == 'b') bCnt++;
            else {
                delReq = Math.min(delReq + 1, bCnt);
            }
        }
        return delReq;
    }
}