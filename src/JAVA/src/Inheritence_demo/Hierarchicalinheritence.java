package Inheritence_demo;
class Car{
	void A() {
		System.out.println("CAR");
		System.out.println("no cost");
		System.out.println("no mialage");
		System.out.println("------------");
	}
}
class Audi extends Car{
	void B(int x,String mialage) {
		System.out.println("Audi");
		System.out.println("cost is "+x);
		System.out.println("mialage is "+mialage);
		System.out.println("------------");
	}
}
class Ferrari extends Car{
	void C(int x,String mialage ) {
		System.out.println("Audi");
		System.out.println("cost is "+x);
		System.out.println("mialage is "+mialage);
		System.out.println("------------");
	}
}
public class Hierarchicalinheritence {

	public static void main(String[] args) {
		Audi a = new Audi();
		Ferrari f = new Ferrari();
		a.A();
		a.B(4999999,"15km");
        f.C(9999999,"10km");
	}

}
