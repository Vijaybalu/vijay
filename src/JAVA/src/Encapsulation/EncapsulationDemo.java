package Encapsulation;
class Encapsulation{
	private String name;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		System.out.println("some one chainging your name");
		this.name=name;
		
	}
}
public class EncapsulationDemo {

	public static void main(String[] args) {
		
		Encapsulation e = new Encapsulation();
		e.setName("vijay");
		System.out.println(e.getName());
	
	}

}
