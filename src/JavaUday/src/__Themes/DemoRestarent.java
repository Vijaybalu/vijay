package __Themes;

 class customer {
	
	void menu() {
		System.out.println("1.idly 2.dosa 3.Wada");
	}
	void placeOrder(String order) {
		System.out.println("Order is given "+order);
	}
	String servefood(){
		return "idly";
	}
	String payBill(int bill) {
		System.out.println("The bill is = "+bill);
		return "paid";
	}
 }
	public class DemoRestarent{
	
	public static void main(String[] args) {
		
		customer orhis=new customer();
		orhis.menu();
		orhis.placeOrder("idly");
		System.out.println("food served is "+orhis.servefood());
		System.out.println("Bill status: "+orhis.payBill(80));

	
  }
}
