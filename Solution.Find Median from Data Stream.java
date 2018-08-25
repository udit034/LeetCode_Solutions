public class MedianFinder {
    PriorityQueue<Integer> lt;
    PriorityQueue<Integer> gt;

    /** initialize your data structure here. */
    public MedianFinder() {
        lt = new PriorityQueue<Integer>(Collections.reverseOrder());
        gt = new PriorityQueue<Integer>();
    }
    
    public void addNum(int num) {
        if( !lt.isEmpty() && num < lt.peek() )
            lt.offer( num );
        else
            gt.offer( num );
        
        PriorityQueue<Integer> g = lt.size() > gt.size() ? lt :  gt;
        PriorityQueue<Integer> l = g == lt ? gt : lt;
        
        while( g.size() - l.size() > 1 )
            l.offer( g.remove() );
        
    }
    
    public double findMedian() {
        if( lt.size() == gt.size() )
            return (double) ( (double) lt.peek() + (double) gt.peek() ) / 2;
        
        PriorityQueue<Integer> g = lt.size() > gt.size() ? lt :  gt;
        return g.peek();
    }
}

/**
 * Your MedianFinder object will be instantiated and called as such:
 * MedianFinder obj = new MedianFinder();
 * obj.addNum(num);
 * double param_2 = obj.findMedian();
 */