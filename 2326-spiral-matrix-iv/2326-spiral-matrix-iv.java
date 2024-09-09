/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] ans = new int[m][n];
        int t = 0, b = m - 1, r = n - 1, l = 0;
        for (int[] row : ans)
            Arrays.fill(row, -1);
        while (head != null) {
            for (int j = l; j <= r && head != null; j++) {
                ans[t][j] = head.val;
                head = head.next;
            }
            t++;
            
            for (int i = t; i <= b && head != null; i++) {
                ans[i][r] = head.val;
                head = head.next;
            }
            r--;
            
            for (int j = r; j >= l && head != null; j--) {
                ans[b][j] = head.val;
                head = head.next;
            }
            b--;
            
            for (int i = b; i >= t && head != null; i--) {
                ans[i][l] = head.val;
                head = head.next;
            }
            l++;
        }
        return ans;
    }
}