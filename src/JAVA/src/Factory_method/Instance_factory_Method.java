package Factory_method;
class Vehicle {
	void bike() {
		System.out.println("Bike details");
	  	System.out.println("-----------------------");
	}
}
class Bikes extends Vehicle{
	
	void bike() {
		
	  	System.out.println("bike name is duke");
	  	System.out.println("bike color is white");
	  	System.out.println("bike cost is 17999"); 
	}
	}
class Jaguar extends Vehicle{
	
	void bike() {
		
	  	System.out.println("bike name is jaguar");
	  	System.out.println("bike color is white");
	  	System.out.println("bike cost is 17999"); 
	}
}
class Factory{
	Vehicle getBikes(String bikesname) {
	if (bikesname.equals("Bikes"))
		return new Bikes();
	else if (bikesname.equals("Jaguar"))
		return new Jaguar();
	else
	return null;
	}

   }

public class Instance_factory_Method {
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.bike();
		Factory f = new Factory();
		Vehicle b = f.getBikes("Bikes");
		b.bike();
		System.out.println("================================");
		Vehicle b1 = f.getBikes("Jaguar");
		b1.bike();

	}
}

