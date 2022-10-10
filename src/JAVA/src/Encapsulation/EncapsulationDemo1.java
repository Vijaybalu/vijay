package Encapsulation;
class Encapsulation1{
	int id;
	String name;
	float salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
}
public class EncapsulationDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Encapsulation1 e1 = new Encapsulation1();
		e1.getId();
		e1.setId(303);
		e1.getName();
		e1.setName("vijay");
		e1.getSalary();
		e1.setSalary(30000);
		System.out.println(e1.id);
		System.out.println(e1.name);
		System.out.println(e1.salary);
		
	}

}
