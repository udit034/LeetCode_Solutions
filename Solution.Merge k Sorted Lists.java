/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        
        if( lists.length == 0 || lists == null ) return null;
        
        ArrayList< Integer > res = new ArrayList< Integer >();
        
        for( int i = 0; i < lists.length; i++ )
            for( ListNode j = lists[i]; j != null; j = j.next )
                res.add( j.val );
        
        Collections.sort( res );
        
        ListNode r = null;
        ListNode head = null;
        if( res.size() >= 1 )
            r = new ListNode( res.get(0) );
        head = r;
        for( int i = 1; i < res.size(); i++ )
        {
            r.next = new ListNode( res.get(i) );
            r = r.next;
        }
        
        return head;
        
    }
}