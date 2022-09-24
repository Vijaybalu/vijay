package Interface;
interface Vehicle{
	void cost();
	void milage();
}
abstract class Car implements Vehicle{
	void viper() {
		System.out.println("viper is cleaning car front glass in rain");
	}
	void tires() {
		System.out.println("car has 4 tires");
	}
}
abstract class Bike implements Vehicle{
	void stans() {
		System.out.println("bike has stand");
	}
	void tire() {
		System.out.println("bike had 2 tires");
	}
}
class Bmw extends Car{
    public void cost() {
	    System.out.println("BMW cost is 2000000");
	}	
    public void milage() {
		System.out.println("milage is 15km");
	}	
}
class Duke extends Bike{
    public void cost() {
    	System.out.println("Duke cost is 250000");
	}
	public void milage() {
		System.out.println("milage is 30km");
	}
}
public class InterfaceDemo {
    public static void main(String[] args) {
		Car c;
		c=new Bmw();
		c.viper();
        c.cost();
        c.milage();
       
        c.tires();
        Bike b;
        b=new Duke();
        b.cost();
        b.tire();
        b.milage();
	}

}
