class Solution {
    public int[] numberOfLines(int[] widths, String S) {
        int currline = 0;
        int no = 1;
        for( Character c : S.toCharArray() )
        {
            int index  = c - 'a';
            if( currline + widths[ index ] > 100 )
            {
                currline = widths[ index ];
                no++;
            }
            else
                currline += widths[ index ];
        }
        int[] result = { no, currline };
        return result;
    }
}