package Methodpoverriding;
class Weickle {
	void bike() {
		System.out.println("bike name is pulsar");
	  	System.out.println("bike color is black");
	  	System.out.println("bike cost is 99999");
	  	System.out.println("-----------------------");
	}
}
class Bikes extends Weickle{
	
	void bike() {
		
	  	System.out.println("bike name is duke");
	  	System.out.println("bike color is white");
	  	System.out.println("bike cost is 17999"); 
	}
	}


public class Methodpoverridingdemo1 {

	public static void main(String[] args) {
		Weickle b = new Weickle();
		b.bike();
		b=new Bikes();
		b.bike();

	}

}
