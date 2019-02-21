public class Solution {
    
    public boolean check(int[] a)
    {
        for( int i = 0; i < a.length; i = i + 2 )
            if( ( i + 1 < a.length && a[i] >= a[i+1] ) || ( i - 1 >= 0 && a[i] >= a[i-1] ) )
                return false;
        
        for( int i = 1; i < a.length; i = i + 2 )
            if( ( i + 1 < a.length && a[i] <= a[i+1] ) || ( i - 1 >= 0 && a[i] <= a[i-1] ) )
                return false;
        
        return true;
    }
    
    void leftRotate(int arr[], int d, int n) 
    {
        int i;
        for (i = 0; i < d; i++)
            leftRotatebyOne(arr, n);
    }
 
    void leftRotatebyOne(int arr[], int n) 
    {
        int i, temp;
        temp = arr[0];
        for (i = 0; i < n - 1; i++)
            arr[i] = arr[i + 1];
        arr[i] = temp;
    }
    
    
    public void wiggleSort(int[] nums) {
        List<Integer> a = new ArrayList< Integer >();
        for( int i = 0; i < nums.length; i++ )
            a.add( nums[i] );
        Collections.sort( a );
        
        int c = 0;
        for( int i = 0; i < nums.length; i = i + 2 )
            nums[i] = a.get( c++ );
        
        for( int i = 1; i < nums.length; i = i + 2 )
            nums[i] = a.get( c++ );
        
        if( check(nums) )
            return;
        else
        {
            while( check(nums) != true )
                leftRotate( nums, 1, nums.length );
            return;
        }
        
    }
}