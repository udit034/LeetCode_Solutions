public class MinStack {
ArrayList<Integer> a;
ArrayList<Integer> b;    
    /** initialize your data structure here. */
    public MinStack() {
        a = new ArrayList<Integer>();
        b = new ArrayList<Integer>();
    }
    
    public void push(int x) {
        int ind = Collections.binarySearch( a, x );
        if( ind < 0 )
            ind  = -1-ind;
        a.add( ind, x );
        b.add( 0, x );
    }
    
    public void pop() {
        int temp = b.remove( 0 );
        
        int ind = Collections.binarySearch( a, temp );
        if( ind < 0 )
            ind  = -1-ind;
        
        a.remove( ind );
    }
    
    public int top() {
        return b.get(0);
    }
    
    public int getMin() {
        return a.get(0);
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(x);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */