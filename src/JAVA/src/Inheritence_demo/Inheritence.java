package Inheritence_demo;

class mobile{
	void A() {
		System.out.println("mobile has many brands");
	}
}
class oneplus extends mobile{
	void B() {
		System.out.println("ONE PLUS 9PRO is my mobile");
	}
}
class oneplus9pro extends oneplus{
	void B() {
	    System.out.println("One plus 9pro is one of the best mobile ");
		System.out.println("one plus cost is 40k");
		System.out.println("one plus 9pro has 50mega pixels camera");
		System.out.println("one plus 9pro has indisplay the fingerprint");
	}
}
public class Inheritence {

	public static void main(String[] args) {
		oneplus9pro o = new oneplus9pro();
		o.A();
		o.B();

	}

}
