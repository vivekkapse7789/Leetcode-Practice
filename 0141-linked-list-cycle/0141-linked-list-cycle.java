public class Solution {
    public boolean hasCycle(ListNode head) {
        // 1. Edge case: If list is empty or has only one node, no cycle is possible
        if (head == null || head.next == null) {
            return false;
        }

        ListNode slow = head;
        ListNode fast = head;

        // 2. The 'Race': Fast moves twice as quick as slow
        while (fast != null && fast.next != null) {
            slow = slow.next;          // Move 1 step: slow = slow.next
            fast = fast.next.next;     // Move 2 steps: fast = fast.next.next

            // 3. If they land on the same node, a cycle exists
            if (slow == fast) {
                return true;
            }
        }

        // 4. If fast hits the end of the list, no cycle exists
        return false;
    }
}