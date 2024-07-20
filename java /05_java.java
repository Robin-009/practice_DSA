// Given the head of a singly linked list, reverse the list, and return the reversed list.

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        
        while (curr != null) {
            ListNode next = curr.next; // temporarily store the next node
            curr.next = prev; // reverse the current node's pointer
            prev = curr; // move pointers one position ahead
            curr = next;
        }
        
        return prev; // prev will be the new head of the reversed list
    }
}
