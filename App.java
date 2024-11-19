
public class App {

	public static void main(String[] args) {
		
		int [] a = new int [100];
		
		for (int i=0; i < a.length; i++) {
			a[i] = i+1;
		}
		
		for (int i=0; i < a.length; i++) {
			for (int j=2; j < i; j++) {
				if (a[i]==1) a[i] = 0;
				if (a[i]%j==0) {
					a[i] = 0;
				}
			}
		}
		
		for (int i=0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		
		
	}

}
