package THEMES;
class Amount{
	String name;
	long number;
	int cash;
	Short transfer;
	String bill;
	char message;
	}
public class OnlinePaments {

	public static void main(String[] args) {
	    Amount vijay = new Amount();
	    vijay.name="Phonepay";
	    vijay.number=8179719094l;
	    vijay.cash=500;
	    vijay.transfer=500;
	    vijay.bill="paid";
	    vijay.message='1';
	    System.out.println(vijay.name+ " Transection");
	    System.out.println("-------------------------");
	    System.out.println("number is "+vijay.number);
	    System.out.println("the amouont is "+vijay.cash);
	    System.out.println("transfer amount is "+vijay.transfer);
	    System.out.println("amount is "+vijay.bill);
	    System.out.println("you have "+vijay.message+" message");
	    	
	    

	}

}
