package Abstract;
import java.util.Scanner;
abstract class Restaurent{
	abstract void placeOrder();
	
	void order(String name) {
		System.out.println("i selected "+name);
	}
	Restaurent(){
		System.out.println("RESTAURENT");
	}
	Restaurent(String order1,String order2,String order3,String order4){
		System.out.println("Select item");
		System.out.println("------------");
		System.out.println(order1);
		System.out.println(order2);
		System.out.println(order3);
		System.out.println(order4);
	}
}
class treat extends Restaurent{
    void placeOrder() {
		System.out.println("treat restaurent is best quality");
	}
	treat(){
		super();
	}
	treat(String order1,String order2,String order3,String order4){
		super(order1,order2,order3,order4 );
	}
}
public class Abstractdemo5 {
   public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	    Restaurent obj;
		treat t = new treat();
		t.placeOrder();
		obj=new treat("biryani","fride rice","nuddles","manchurya");
		t.order(sc.next());
        }
}
