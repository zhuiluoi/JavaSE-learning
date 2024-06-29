
class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Demo2 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode cur1 = list1;
        ListNode cur2 = list2;
        ListNode newHead = new ListNode(0);
        ListNode cur3 = newHead;

        while (cur1 != null && cur2 != null) {
            if (cur1.val < cur2.val) {
                cur3.next = cur1;
                cur1 = cur1.next;
            } else {
                cur3.next =cur2;
                cur2 = cur2.next;
            }
            cur3 = cur3.next;
        }

        if (cur1 != null) {
            cur3.next = cur1;
        }
        if (cur2 != null) {
            cur3.next = cur2;
        }

        return newHead.next;

    }
}
