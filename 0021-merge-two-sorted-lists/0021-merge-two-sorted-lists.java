
class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to act as the starting point
        ListNode dummy = new ListNode(-1);
        ListNode curr = dummy;

        // Iterate while both lists have nodes
        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }
            // Move the cursor forward in the new list
            curr = curr.next;
        }

        // If one list is finished, append the rest of the other list
        if (list1 != null) {
            curr.next = list1;
        } else {
            curr.next = list2;
        }

        // Return the actual head (node after dummy)
        return dummy.next;
    }
}