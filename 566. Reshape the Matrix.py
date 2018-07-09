import numpy as np
class Solution(object):
    def matrixReshape(self, nums, r, c):
        """
        :type nums: List[List[int]]
        :type r: int
        :type c: int
        :rtype: List[List[int]]
        """
        a = np.array( nums )
        if a.shape[0] * a.shape[1] == r * c:
            return a.reshape( r, c ).tolist()
        else:
            return nums