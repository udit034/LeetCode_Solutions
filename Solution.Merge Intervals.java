/**
 * Definition for an interval.
 * public class Interval {
 *     int start;
 *     int end;
 *     Interval() { start = 0; end = 0; }
 *     Interval(int s, int e) { start = s; end = e; }
 * }
 */
public class Solution {
    
    public Interval checkRange( Interval a, Interval b )
    {
        int min = a.start <= b.start ? a.start : b.start;
        int max = a.end >= b.end ? a.end : b.end;
        
        int dif1 = a.end - a.start;
        int dif2 = b.end - b.start;
        
        if( min <= a.end && a.end <= max &&  min <= b.start && b.start <= max )
            if(  dif1 + dif2 >= max - min )
                return new Interval( min, max );
        
        return null;
    }
    
    
    
    public List<Interval> merge(List<Interval> intervals) {
       Collections.sort( intervals, new Comparator<Interval>() 
                         {
                             public int compare( Interval a, Interval b )
                             {
                                 return a.start - b.start;
                             }
                         });
        
         for( int i = 0; i < ( intervals.size() - 1 ); i++ )
         {
             Interval prev = intervals.get( i );
             Interval next = intervals.get( i + 1 );
             
             int greater = prev.end > next.end  ? 1 : 0;
             Interval newInterval = checkRange( prev, next );
             
            
             if( newInterval != null )
            {
                 intervals.remove( i );
                 intervals.remove( i );
                 intervals.add( i, newInterval );
                 i--;
            }
             
         } 
         return intervals;
    }
}