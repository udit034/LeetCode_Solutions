/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if( l1 == null ) return l2;
        if( l2 == null ) return l1;
        ListNode head = null;
        if( l1.val <= l2.val )
        {
            head = new ListNode( l1.val );
            l1 = l1.next;
        }
        else
        {
            head = new ListNode( l2.val );
            l2 = l2.next;
        }
        ListNode n = head;
        
        
        while( l1 != null && l2 != null )
        {
            if( l1.val <= l2.val )
            {
                n.next = l1;
                n = n.next;
                l1 = l1.next;
            }
            else
            {
                n.next = l2;
                n = n.next;
                l2 = l2.next;
            }
        }
        
        while( l1 != null )
        {
            n.next = l1;
            n = n.next;
            l1 = l1.next;
        }
        
        while( l2 != null )
        {
            n.next = l2;
            n = n.next;
            l2 = l2.next;
        }
        
        return head;
        
    }
}