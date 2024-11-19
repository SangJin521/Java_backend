import java.lang.Math;

public class Mon {

	public static void main(String[] args) {
		double x, y;
		double ans = 0;
		for(int i=0; i<1000; i++) {
			x = Math.random();
			y = Math.random();
			
			if((x*x + y*y)<1) {
				ans += 1;
			}
			
			double Pi = 4.0 * ans/i;
			
			System.out.println(Pi);
		}

	}

}
