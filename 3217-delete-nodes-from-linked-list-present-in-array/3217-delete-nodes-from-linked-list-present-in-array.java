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
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>();
        for (int n : nums) {
            set.add(n);
        }
        ListNode root = null, befoNode = null;
        while (head != null) {
            if (set.contains(head.val)) {
                if (befoNode != null) {
                    befoNode.next = head.next;
                }
            } else {
                if (root == null) {
                    root = head;
                }
                befoNode = head;
            }
            head = head.next;
        }
        return root;
    }
}