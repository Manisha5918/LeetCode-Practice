public class Solution {
    public ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        // Step 1: Detect whether a cycle exists
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                // Step 2: Find the beginning of the cycle
                ListNode p = head;

                while (p != slow) {
                    p = p.next;
                    slow = slow.next;
                }

                return p;
            }
        }

        // No cycle
        return null;
    }
}