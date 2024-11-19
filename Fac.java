
public class Fac {
	
	static long factorial(int n){
		
		  if (n == 1) return 1 ;
		  
		  return n * factorial(n-1); 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long result;
		for (int i=1; i<25; i++) {
			result = factorial(i);
			
			if (result>0) {
				System.out.println(i + " = " + result);
			} else {
				break;
			}
			
			
		}
	}

}
