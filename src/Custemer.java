package vijaybalu;
class restuarent{
	void menu() {
		System.out.println("1.bat 2.ball 3.wicket");
	}
	void placeorder(String order) {
		System.out.println("I selected "+order);
	}
	String tacking() {
		System.out.println("it is very good");
		return "bat";
	}
	String payBill(int amount) {
		System.out.println("Amount is give rs :"+amount);
		return "paid";
	}
}

public class Custemer {

	public static void main(String[] args) {
		restuarent obj = new restuarent();
		obj.menu();
		obj.placeorder("bat");
		System.out.println("recieving my "+obj.tacking());
		System.out.println("bill "+obj.payBill(2000));

	}

}