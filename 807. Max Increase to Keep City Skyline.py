import numpy as np
class Solution(object):
    def maxIncreaseKeepingSkyline(self, grid):
        """
        :type grid: List[List[int]]
        :rtype: int
        """
        tbgrid = np.max( grid, axis = 1 )
        lrgrid = np.max( grid, axis = 0)
        increase = 0
        for i in range( len( grid ) ):
            for j in range( len( grid[0] ) ):
                max_increase = min( tbgrid[i], lrgrid[j] )
                if grid[i][j] < max_increase:
                    increase += max_increase - grid[i][j]
        return int( increase )