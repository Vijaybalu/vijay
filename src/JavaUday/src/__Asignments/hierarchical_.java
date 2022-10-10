package __Asignments;

//hierarchical inheritance

class sports{
	void _Sports(){
	
	System.out.println("there are different types of sports are there ");
	}
	void types() {
		System.out.println(" >> indoor ");
		System.out.println(" >> outdoor ");
	}
}
class cricket extends sports{
	
	void outdoor() {
	
	System.out.println("cricket is national level outdoor game");
	}
}
class chess extends sports{
	
	void indoor() {
	System.out.println("chess is national level indoor game");
	}
}
public class hierarchical_ {

	public static void main(String[] args) {
		
		
		chess s= new chess();
		s._Sports();
		s.types();
		s.indoor();
		
		cricket s1 = new cricket();
		s1.outdoor();
		
		

	}

}
