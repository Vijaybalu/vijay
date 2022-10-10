package __Themes;

class car{
	void cost() {
		System.out.println("NO cost for CAR");
	}
	void milage() {
		System.out.println("NO milage for CAR");
	}
}

class TESLA extends car{
	void cost() {
		System.out.println("cost of TESLA is 50lks");
	}
	void milage() {
		System.out.println("milage of TESLA is a electric vehicle");
	}
}
class TATA extends car{
	void cost() {
		System.out.println("cost of  TATA is 40lks");
	}
	void milage() {
		System.out.println("milage of TATA is 15km/l");
	}
}
public class __Automobiles {

	public static void main(String[] args) {

		car mytheme = new car();
		mytheme.cost();
		mytheme.milage();

		System.out.println("--------"); //UP CASTING
		mytheme=new TESLA();
		mytheme.cost();
		mytheme.milage();
		
		System.out.println("--------");
		mytheme= new TESLA();
		mytheme.cost();
		mytheme.milage();
		
		System.out.println("--------");
		mytheme=new car();
		mytheme.cost();
		mytheme.milage(); 	//down casting
	

	}

}
