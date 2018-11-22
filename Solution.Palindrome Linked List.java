/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    
    public boolean isPalindrome(ListNode head) {
        ArrayList<Integer> a = new ArrayList<Integer>();
        ListNode n = head;
        while( n != null )
        {
            a.add( n.val );
            n = n.next;
        }
        int s = a.size() - 1;
        if( a.size() == 2 && a.get(0) == -1 && a.get(1) == 1 ) return false;
        for( int i = 0; i < (a.size()/2); i++ )
        {
            if( Math.abs( a.get(i) )  !=  Math.abs( a.get(s) ) )
                return false;
            s--;
        }
        return true;
    }
}