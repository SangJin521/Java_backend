package LambdaEx;

public class MyFnInterfaceEx01 {

	public static void main(String[] args) {
		MyFnInterface01 fi;
		
		fi = () -> {
			String str = "method call01";
			System.out.println(str);
		};
		fi.method();
		
		fi = () -> {System.out.println("method call02");};
		fi.method();
		
		fi = () -> {System.out.println("method call02");};
		fi.method();
	}

}
