package Encapsulation;
import java.util.*;
class Employee{
	int id;
	String name;
	float salary;
	
	public Employee(int id, String name, float salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
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

public class StraemDemo {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<Employee>();
        l.add(new Employee(303,"vijay",50000));
        l.add(new Employee(302,"pavan",100000));
        l.add(new Employee(313,"jamili",45000));
        l.add(new Employee(306,"lokesh",60000));
      Iterator<Employee> i = l.iterator();
      while(i.hasNext()) {
    	  Employee e = i.next();
    	  if(e.getSalary()>=2000000) {
    	  System.out.println(e.getSalary()+""+e.getId()+" "+e.getName());
    	  }
    	  else {
    		  System.out.println("its not applicable");
    	  }
      }
    }
}



