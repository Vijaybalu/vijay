package THEMES;
interface Store{
	void cost() ;
	void quality();
}
abstract class Groceries implements Store{
	void packing() {
		System.out.println("Groceries are packing");
	}
}
abstract class vegitables implements Store{
	void packed() {
		System.out.println("vegitables are non packed");
	}
}
class Oil extends Groceries{
    public void cost() {
    	super.packing();
        System.out.println("1 lr freedom Oil cost is 220 rupees");
	}
    public void quality() {
        System.out.println("fredom oil quality is number one");
    }
}
class Onians extends vegitables{
    public void cost() {
    	super.packed();
        System.out.println("1 kg Onians cost is 30 rupees");
	}
    public void quality() {
        System.out.println("Onians quality is good");
    }
}
public class Stores_Interface {
   public static void main(String[] args) {
        Store s;
        s=new Oil();
        s.cost();
        s.quality();
        s=new Onians();
        s.cost();
        s.quality();
    }
}
