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
    public ListNode mergeNodes(ListNode head) {
        ListNode nextNode = head.next, modify = nextNode;
        while (nextNode != null) {
            int sum = 0;
            while (nextNode.val != 0) {
                sum += nextNode.val;
                nextNode = nextNode.next;
            }
            modify.val = sum;
            nextNode = nextNode.next;
            modify.next =nextNode;
            modify = modify.next;
        }
        return head.next;
    }
}