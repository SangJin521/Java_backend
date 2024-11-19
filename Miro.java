
public class Miro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a = new int[9];
		int j=0;
		for (int i=1; i<=100; i++) {
			if (i%11==0) {
				a[j] = i;
				j++;
			}
		}
		for (int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
