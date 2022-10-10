package Exceptionhandling;

public class Exceptionhandling2 {
	void A(int b){
		try {
		int a=3/0;
		System.out.println("its a infinite value");
		}
		catch(ArithmeticException ae) {
			ae.printStackTrace();
		}
	    }
public static void main(String[] args) {
		Exceptionhandling2 obj = new Exceptionhandling2();
        obj. A(25);
        System.out.println("program completed");
       }
	   }
