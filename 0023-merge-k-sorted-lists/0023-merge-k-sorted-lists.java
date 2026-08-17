class Solution {

    public ListNode merge(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                curr.next = list1;
                list1 = list1.next;
            } else {
                curr.next = list2;
                list2 = list2.next;
            }

            curr = curr.next;
        }

        if (list1 != null) {
            curr.next = list1;
        }

        if (list2 != null) {
            curr.next = list2;
        }

        return dummy.next;
    }

    public ListNode split(ListNode[] lists, int start, int end) {

        if (start == end) {
            return lists[start];
        }

        int mid = start + (end - start) / 2;

        ListNode list1 = split(lists, start, mid);
        ListNode list2 = split(lists, mid + 1, end);

        return merge(list1, list2);
    }

    public ListNode mergeKLists(ListNode[] lists) {

        if (lists.length == 0) {
            return null;
        }

        return split(lists, 0, lists.length - 1);
    }
}