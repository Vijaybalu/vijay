package THEMES;
class Pens{
	void blue(int high) {
		System.out.println("blue pen cost is "+high);
	}
}
class pens1 extends Pens{
	void blue(int high) {
		super.blue(6);
		System.out.println("red pen cost is "+high);
	}
}
public class Super3 {

	public static void main(String[] args) {
		pens1 obj = new pens1();
		obj.blue(5);

	}

}
