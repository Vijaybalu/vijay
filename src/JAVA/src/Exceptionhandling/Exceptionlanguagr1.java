package Exceptionhandling;

public class Exceptionlanguagr1 {
	public static void main(String []args) {
		try {
	int a=3/0;
	System.out.println(a);
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println("progaram completed");
		}
		try {
			System.out.println("program started");
		int a=3/0;
		throw new ArithmeticException("its infinite value");//throws
	    }
		catch(ArithmeticException ae){
			ae.printStackTrace();
			System.out.println("program completed");
		}
		}
		
	}

