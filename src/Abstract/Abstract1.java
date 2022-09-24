package Abstract;

abstract class Abstract2 {      //Abstract class
	    abstract void A() ;     //Abstract method
	    void B() {              //concrete method
		System.out.println("DAD");
	    }
        }
public class Abstract1 extends Abstract2 {  //inheritence
		void A() {              //method overriding
			System.out.println("MOM");
		}
        public static void main(String[] args) {
		Abstract1 obj = new Abstract1();
		obj.B();
		obj.A();
        }
        }
		

	


	
	
	

	
