public class Solution {
    
    public String countAndSay(int n) {
            ArrayList<String> s = new ArrayList<String>();   
	        s.add("1");
	        s.add("11");
	        s.add("21");
	        s.add("1211");
	        s.add("111221");
	        if( n <= 5 ) return s.get( n - 1 );
	        for( int i = 5; i < n; i++ )
	        {
	            String temp = "";
	            int count = 1;
	            int j = 0;
	            String prev = s.get( i - 1 );
	            for( ; j < prev.length()-1; j++ )
	            {
	                while( j < prev.length()-1 && prev.charAt(j) == prev.charAt(j+1) )
	                {
	                    count++;
	                    j++;
	                }
	                temp = temp + count + prev.charAt(j);
	                count = 1;
	            }
	            if( j < prev.length() && count > 0 )
	            	temp = temp + count + prev.charAt(j);
	            s.add( temp );
	        }
	        return s.get( n - 1 );
        
    }
}