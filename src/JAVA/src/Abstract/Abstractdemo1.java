package Abstract;

abstract class Abstract2 {     
	    abstract void A() ;    
	    void B() {              
		System.out.println("DAD");
	    }
        }
class Abstract extends Abstract2 { 
		void A() {              
		System.out.println("MOM");
		}
        }
		public class Abstractdemo1{
        public static void main(String[] args) {
		Abstract obj = new Abstract();
		obj.B();
		obj.A();
        }
        }
		

	


	
	
	

	
