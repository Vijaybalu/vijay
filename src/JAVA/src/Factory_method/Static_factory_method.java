package Factory_method;
class Automobile {
	void car() {
		System.out.println("car details");
	  	System.out.println("-----------------------");
	}
    }
class Car extends Automobile{
	
	void car() {
		
	  	System.out.println("Car name is ZEST");
	  	System.out.println("Car color is white");
	  	System.out.println("Car cost is 2799999"); 
	}
	}
class Benz extends Automobile{
	
	void car() {
		
	  	System.out.println("Car name is BENZ");
	  	System.out.println("Car color is BLACK");
	  	System.out.println("Car cost is 9000000"); 
	}
	}
class Factory1{
  static Automobile getCar(String name) {
	if (name.equals("ZEST"))
		return new Car();
	else if (name.equals("BENZ"))
		return new Benz();
	else
	return null;
	}
    }
public class Static_factory_method {
	public static void main(String[] args) {
		Automobile a = new Automobile();
		a.car();
		Automobile c =Factory1.getCar("BENZ");
		c.car();
		

	}

}
