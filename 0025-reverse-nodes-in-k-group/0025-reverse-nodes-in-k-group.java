class Solution {
    public ListNode reverse(ListNode curr, ListNode tail) {
        ListNode prev = null;

        while (curr != tail) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return prev;
    }

    public ListNode reverseKGroup(ListNode head, int k) {
        if (head == null || head.next == null || k == 1) {
            return head;
        }

        ListNode curr = head;
        ListNode prevTail = null;
        ListNode newHead = null;

        while (curr != null) {

            // Find kth node
            ListNode tail = curr;

            for (int i = 1; i < k; i++) {
                if (tail == null) {
                    break;
                }
                tail = tail.next;
            }

            // Less than k nodes remaining
            if (tail == null) {
                if (prevTail != null) {
                    prevTail.next = curr;
                }
                break;
            }

            // Node after current group
            ListNode nextGroup = tail.next;

            // Reverse current group
            ListNode reversedHead = reverse(curr, nextGroup);

            // First reversed group becomes new head
            if (newHead == null) {
                newHead = reversedHead;
            }

            // Connect previous group
            if (prevTail != null) {
                prevTail.next = reversedHead;
            }

            // curr is now the tail of reversed group
            prevTail = curr;

            // Move to next group
            curr = nextGroup;
        }

        return newHead;
    }
}