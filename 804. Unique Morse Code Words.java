class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] codes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set< String > h = new HashSet< String >();
        for( String w : words )
        {
            StringBuilder sb = new StringBuilder();
            for( Character c : w.toCharArray() )
                sb.append( codes[ c - 'a' ] );
            h.add( sb.toString() );
        }
        return h.size();
    }
}