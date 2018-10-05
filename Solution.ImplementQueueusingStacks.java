class MyQueue {
    Stack< Integer > s;
    Stack< Integer > temp;
    /** Initialize your data structure here. */
    public MyQueue() {
        s = new Stack< Integer >();
        temp = new Stack< Integer >();    
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s.push( x );
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        
        while( !s.isEmpty() )
            temp.push( s.pop() );
        
        int ret = temp.pop();
        
        while( !temp.isEmpty() )
            s.push( temp.pop() );
        return ret;
    }
    
    /** Get the front element. */
    public int peek() {
        
        while( !s.isEmpty() )
            temp.push( s.pop() );
        int ret = temp.peek();
        
        while( !temp.isEmpty() )
            s.push( temp.pop() );
        
        return ret;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */