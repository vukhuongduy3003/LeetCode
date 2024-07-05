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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        int minDistance = Integer.MAX_VALUE;
        int firstIndex = -1;
        int prevIndex = -1;
        ListNode preNode = head;
        ListNode currNode = head.next;
        int index = 1;
        while (currNode.next != null) {
            if ((preNode.val < currNode.val && currNode.next.val < currNode.val) || (preNode.val > currNode.val && currNode.next.val > currNode.val)) {
                if (firstIndex == -1) {
                    firstIndex = index;
                }
                if (prevIndex != -1) {
                    minDistance = Math.min(minDistance, index - prevIndex);
                }
                prevIndex = index;
            }
            preNode = currNode;
            currNode = currNode.next;
            index++;
        }
        if (minDistance == Integer.MAX_VALUE) {
            return new int[] {-1, -1};
        }
        return new int[] {minDistance, prevIndex - firstIndex};
    }
}