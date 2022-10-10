package __Themes;

public class Theme_With_variables {
	
	void automobile() {
		
		System.out.println(" Lamborghani");
		System.out.println(" Audi");
		System.out.println(" Bently");
		System.out.println(" Tata");
		System.out.println(" Tesla");
		
	}
	String engine() {
		
		return"petrol/diesel/electric";
	}
	void cost(String around) {
		System.out.println(" They costs may be above "+around);
	}

	public static void main(String[] args) {
		
		Theme_With_variables obj = new Theme_With_variables();
		obj.automobile();
		obj.cost("1cr");
		System.out.println(" The engines are the varients like  "+obj.engine());
	}

}
