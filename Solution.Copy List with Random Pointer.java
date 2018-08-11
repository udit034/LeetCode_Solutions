/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if( head == null ) return null;
        
        RandomListNode cur = null, res = null, origHead = head;
        HashMap< RandomListNode, RandomListNode > h = new HashMap< RandomListNode, RandomListNode >();
        
        res = new RandomListNode( head.label );
        cur = res;
        h.put( head, res );
        head = head.next;

        
        while( head != null )
        {
            cur.next = new RandomListNode( head.label );
            cur = cur.next;
            h.put( head, cur );
            head = head.next;
        }
        
        cur = res;
        head = origHead;
        
        while( head != null )
        {
            cur.random = h.get( head.random );
            cur = cur.next;
            head = head.next;
        }
        
        return res;
    }
}