class Solution {
    public int determineLimit( String S, HashMap< Character, Integer > m, int start, int end )
	{
		int highest = start;
		for( int i = start; i < end; i++ )
			if( m.get( S.charAt(i) ) > highest )
				highest = m.get( S.charAt(i) );
		return highest;
	}
	
	public List<Integer> partitionLabels(String S) {
		HashMap< Character, Integer > m = new HashMap< Character, Integer >();
		for( int i = 0; i < S.length(); i++ )
			m.put( S.charAt(i), i );
		List<Integer> result = new ArrayList<Integer>();
		int start = 0;
		while( start < S.length()-1 )
		{
            System.out.println(  start + "\t" + m.get( S.charAt( start ) ) );
			int curr = determineLimit(S, m, start, m.get( S.charAt( start ) ) );
			while( curr != determineLimit(S, m, start, curr ) )
                curr = determineLimit(S, m, start, curr );
			result.add( curr - start + 1 );
			start = curr + 1;
		}
        if(start == S.length() - 1 )
            result.add(1);
		return result;
    }
}