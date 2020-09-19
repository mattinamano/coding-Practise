  class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        else if (l2 == null) {
            return l1;
        }
        else if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        }
        else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }

    }
}


public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode merged = new ListNode(0);
        ListNode cur = merged;
        
        while (l1 != null || l2 != null) {
            int val1 = (l1 != null) ? l1.val : Integer.MAX_VALUE;
            int val2 = (l2 != null) ? l2.val : Integer.MAX_VALUE;
            
            if (val1 < val2) {
                cur.next = new ListNode(val1);
                l1 = l1.next;
            }
            else {
                cur.next = new ListNode(val2);
                l2 = l2.next;
            }
            cur = cur.next;
        }
        
        return merged.next;
    }
