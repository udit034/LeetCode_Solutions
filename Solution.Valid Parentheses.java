public class Solution {
    public boolean isValid(String s) {
        
            HashMap< String, String > h = new HashMap< String, String >();
            h.put( "(", ")" );
            h.put( "{", "}" );
            h.put( "[", "]");
        
	        Stack<String> st = new Stack<String>();
	        for( int i = 0; i < s.length(); i++ )
	        {
	        	if( s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[' )
	        		st.push( String.valueOf(s.charAt(i)) );
	        	else
	        	{
                    
	        		if(  st.isEmpty() || !String.valueOf( s.charAt(i) ).equals(h.get( st.pop() )   ) ) 
	        			return false;
	        	}
	        }
	        if( st.isEmpty() )
	        	return true;
	        return false;
    }
}