class Solution {
    public int numJewelsInStones(String J, String S) {
        
        Set< Character > j = new HashSet< Character >();
        for( Character c : J.toCharArray() )
            j.add( c );
        
        int count = 0;
        for( Character c : S.toCharArray() )
            if( j.contains( c ) )
                count++;
        
        return count;
    }
}