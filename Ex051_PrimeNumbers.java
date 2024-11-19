public class Ex051_PrimeNumbers {
	
    public static void main(String[] args) {
        int [] primes = new int[ 100 ] ;
        primes[ 0 ] = 2 ; 
        
        for( int i = 0; i < primes.length -1 ; i ++ ) {
        	for( int k = primes[i] + 1 ; k < 2*primes[i] ; k ++ ) {
        		int m = 0;
        		for( ; m <  i + 1 ; m ++ ) {
        			if( k % primes[i] == 0 ) {
        				// 소수가 아님
        				break; 
        			}
        		}
        		primes[i + 1] = m ;
        	}
        }
        
        for (int i = 0; i < 100; i++) {
        	System.out.println(primes[i]);
        }
    }
    
}
