package Interface;
interface Electronics{
	void cost();
	void storage();
}
abstract class Mobile implements Electronics{
	void touch() {
		System.out.println("Mobiles has no switches only toouchscreen");
	}
}
abstract class Telivision implements Electronics{
	void remot() {
		System.out.println("telivision works on remot control");
	}
}
class Oppo extends Mobile{
    public void cost() {
    	super.touch();
    	System.out.println("Oppo mobile cost is 15000");
    }
    public void storage() {
		System.out.println("internal storage=64gb");
    }
}
class Sony extends Telivision{
    public void cost() {
    	System.out.println("Sony cost is 30000");
    }
    public void storage() {
		System.out.println("Sony internal Storage=16gb");
    }
}
public class InterfaceDemo1 {

	public static void main(String[] args) {
	  Mobile m;
	  m=new Oppo();
	  m.cost();
	  m.storage();
	  Telivision t;
	  t=new Sony();
      t.cost();
      t.storage();
	}
}
