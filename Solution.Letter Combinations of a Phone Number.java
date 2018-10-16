public class Solution {
    public void generateCombinations( String s, ArrayList<ArrayList<String>> keyset, ArrayList<String> res, int ind )
	 {
		 if( ind == (keyset.size()) )
		 {
			 res.add(s);
			 return;
		 }
		ArrayList<String> cur = keyset.get(ind);
		 for( String c : cur )
		 {
			 generateCombinations( s + c, keyset, res, ind + 1 );
		 }
	 }

	 public List<String> letterCombinations(String digits) {
            if( digits.equals("") ) return new ArrayList<String>();
	        HashMap< String, ArrayList< String > > h  = new HashMap< String, ArrayList< String > >();
	        h.put( "2", new ArrayList<>(Arrays.asList("a", "b", "c")) );
	        h.put( "3", new ArrayList<>(Arrays.asList("d", "e", "f")) );
	        h.put( "4", new ArrayList<>(Arrays.asList("g", "h", "i")) );
	        h.put( "5", new ArrayList<>(Arrays.asList("j", "k", "l")) );
	        h.put( "6", new ArrayList<>(Arrays.asList("m", "n", "o")) );
	        h.put( "7", new ArrayList<>(Arrays.asList("p", "q", "r", "s")) );
	        h.put( "8", new ArrayList<>(Arrays.asList("t", "u", "v")) );
	        h.put( "9", new ArrayList<>(Arrays.asList("w", "x", "y", "z")) );
	        
	        List<String> res = new ArrayList<String>();
	        ArrayList<ArrayList<String>> keyset = new ArrayList<ArrayList<String>>();
	        
	        for( char c : digits.toCharArray() )
	        	if( h.containsKey( String.valueOf(c)) )
	        		keyset.add( h.get( String.valueOf(c)) );
	        
	        generateCombinations( "", keyset, (ArrayList<String>) res, 0 );
	        
	        return res;
	    }
}