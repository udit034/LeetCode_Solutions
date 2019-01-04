public class Solution {
    public void rotate(int[][] matrix) {
        int[][] a = matrix;
        int[][] b = new int[a.length][a.length];
		int i = 0;
		while( i < a.length )
		{
			for( int k = 0; k < a.length; k++ )
				b[k][a.length-1-i] = a[i][k];
			i++;
		}
		for( i = 0; i < a.length; i++ )
		{
			for( int j = 0; j < a.length; j++ )
                matrix[i][j] = b[i][j];
		}
    }
}