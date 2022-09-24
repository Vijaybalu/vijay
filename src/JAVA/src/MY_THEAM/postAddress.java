package MY_THEAM;
import java.util.*;
 class postAddress {
	 static Scanner obj=new Scanner(System.in);
	 int cash=0;
      void distance() {
    	  System.out.println("destences are 1km 2km 3km");
      }
      void selectdistance(String km ) {
    	  System.out.println("select the distenmce");
    	  km=obj.next();
    	  System.out.println("distence selected :"+km);
      }
      String take_recipt() {
    	  System.out.println("Recept Recived");
    	  String d=obj.next();
    	  System.out.println(d);
    	  return d;
      }
      void amount(int cash) {
       	  System.out.println("amount is transfared");
    	   this.cash=cash;
    	   System.out.println("amount "+cash);
    	  
      }
	public static void main(String[] args) {
		postAddress obj1=new postAddress();
		obj1.distance();
		obj1.selectdistance("vijay");
		System.out.println("post is  "+obj1.take_recipt());
		obj1.amount(100);
		
		

	}

}
