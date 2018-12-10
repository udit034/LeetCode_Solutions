/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode fast = head;
        ListNode slow = head;
        int count = 0;
        int temp = n ;
        
        while( temp-- > 0 && fast != null )
        {
                 fast = fast.next;
                 count++;     
        }
        
        while( fast != null  )
        {
            fast = fast.next;
            if( fast != null )
                slow = slow.next;
            count++;
        }
        
        System.out.println( count );
        if( n == count )
            return head.next;
        
        
        if( slow != null  )
        {
            
        System.out.println( slow.val );
            slow.next = slow.next.next;
            return head;   
        }
        else
            return null;
        
    }
}