package __Asignments;
 class mobile{
	 void brands() {
		 System.out.println("there are different types of brands in mobiles");
	 }
	 void Brands() {
		 System.out.println("they are ");
		 System.out.println(">> apple");
		 System.out.println(">> samsung");
		 System.out.println(">> nokia ");
		 System.out.println(">> iQoo");
		 System.out.println(">> redmi");
	 }
 }
 

public class multi_level extends mobile {

	public static void main(String[] args) {

		mobile m = new mobile();
		m.brands();
		m.Brands();

	}

}
