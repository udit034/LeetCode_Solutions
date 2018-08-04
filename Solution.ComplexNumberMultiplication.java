class Solution {
    
    public int getReal( String a )
    {
        return Integer.parseInt( a.split( "\\+" )[0] );
    }
    
    public int getImag( String a )
    {
        return Integer.parseInt( a.split( "\\+" )[1].split("i")[0] );
    }
    
    
    public String complexNumberMultiply(String a, String b) {
        int A = getReal( a );
        int B = getImag( a );
        int C = getReal( b );
        int D = getImag( b );
        //System.out.println( A + " " + B + " " + C + " " + D );
        int real = A*C - B*D;
        int comp = A*D + B*C;
        
        return String.valueOf( real ) + "+" + String.valueOf( comp ) + "i";
            
    }
}