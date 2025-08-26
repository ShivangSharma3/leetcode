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
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0) return head;

        // Step 1: Find length and last node
        ListNode temp = head;
        int length = 1; // at least 1 node
        while (temp.next != null) {
            length++;
            temp = temp.next;
        }

        // Step 2: Connect last node to head -> circular list
        temp.next = head;

        // Step 3: Find the new head position
        k = k % length; // handle large k
        int stepsToNewHead = length - k;

        // Step 4: Move to new tail
        ListNode newTail = head;
        for (int i = 1; i < stepsToNewHead; i++) {
            newTail = newTail.next;
        }

        // Step 5: Break the cycle
        ListNode newHead = newTail.next;
        newTail.next = null;

        return newHead;
    }
}
