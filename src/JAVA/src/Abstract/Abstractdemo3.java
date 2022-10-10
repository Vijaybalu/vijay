package Abstract;
abstract class Animal{
	abstract void lifeSpam();
	void breath() {
		System.out.println("all animals breathing is 'Oxygen(O2)' ");
	}
}
class Lion extends Animal{
void lifeSpam() {
	System.out.println("Lion life span 10years");	
    }
}
class Tiger extends Lion{
void lifeSpam() {
	System.out.println("Tiger life span 8years");	
    }
}

public class Abstractdemo3 {

	public static void main(String[] args) {
		Tiger t=new Tiger();
	    t.breath();
		t.lifeSpam();
		Lion l=new Lion();
		l.lifeSpam();
	}

}
