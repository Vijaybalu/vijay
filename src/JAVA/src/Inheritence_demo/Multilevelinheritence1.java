package Inheritence_demo;
class Electronics{
	String name;
	void A(String name) {
		this.name=name;
		System.out.println("Electronics (1.Laptop 2.mobile 3.T.V) ");
		System.out.println("i selected "+name);
	}
}
class Mobiles extends Electronics{
	 void B() {
		 System.out.println("mobiles had more brands");
	 }   
}
class Redmi extends Mobiles{
	 void C(int a) {
		 System.out.println("Oneplus is one of the best brand in mobiles");
		 System.out.println("Oneplus cost is "+a+"k");
	 }
}
public class Multilevelinheritence1 {

	public static void main(String[] args) {
		Mobiles obj = new Mobiles();
		Redmi obj1 = new Redmi();
        obj.A("mobile");
        obj.B();
        obj1.C(50);
        
	}

}
