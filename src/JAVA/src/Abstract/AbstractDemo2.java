package Abstract;
abstract class Car{
	abstract void cost();
	abstract void mialage();
}
class Bmw extends Car {
	void cost() {
		System.out.println("BMW cost is 2000000");
	}
	void mialage() {
		System.out.println("BMW mialage is 15km");
	}
}
class Audi extends Car { 
	void cost() {
		System.out.println("Audi cost is 1500000");
	}
	void mialage() {
		System.out.println("Audi mialage is 18km");
	}
}
public class AbstractDemo2 {

	public static void main(String[] args) {
		Car A = new Audi();
		Car B = new Bmw();
		A.cost();
		A.mialage();
		B.cost();
		B.mialage();
	}

}
